grammar Syslog;

options{
	language = Java;
}
@header{
	package com.peoplemerge.fileadapters;
}
@lexer::header{
	package com.peoplemerge.fileadapters;
}

@members{

}

// Apr 21 07:48:17 Ino anacron[17760]: Job `cron.daily' terminated
// Apr 21 07:48:39 Dave-Thomass-MacBook-Air kernel[0]: CODE SIGNING: cs_invalid_page(0x1000): p=31396[GoogleSoftwareUp] clearing CS_VALID
// Apr 21 15:49:46 192.168.0.2 hostapd: ath1: STA 28:cf:e9:16:b7:13 IEEE 802.11: authenticated
// Apr 21 15:49:46 192.168.0.2 hostapd: ath1: STA 28:cf:e9:16:b7:13 IEEE 802.11: associated (aid 1)
// Apr 21 15:49:46 192.168.0.2 hostapd: ath1: STA 28:cf:e9:16:b7:13 RADIUS: starting accounting session 00000011-00000300
// Apr 21 15:49:46 192.168.0.2 hostapd: ath1: STA 28:cf:e9:16:b7:13 WPA: pairwise key handshake completed (RSN)
// Apr 21 07:49:51 heracles udhcpc[4292]: Sending renew...
// Apr 21 07:49:52 heracles udhcpc[4292]: Lease of 192.168.0.4 obtained, lease time 3600
// Apr 21 07:56:57 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: Starting standard backup
// Apr 21 07:56:57 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: CheckPrefs: Host Prefs
// Apr 21 07:56:57 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: #011#011afp_reconnect_allow: Yes
// Apr 21 07:56:57 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: Attempting to mount network destination URL: afp://ReadyNAS@heracles.local/ReadyNAS
// Apr 21 07:57:04 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: Mounted network destination at mountpoint: /Volumes/ReadyNAS using URL: afp://ReadyNAS@heracles.local/ReadyNAS
// Apr 21 07:57:41 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: Disk image /Volumes/ReadyNAS/Dave Thomas's MacBook Air.sparsebundle mounted at: /Volumes/Time Machine Backups
// Apr 21 07:57:41 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: Backing up to: /Volumes/Time Machine Backups/Backups.backupdb
// Apr 21 07:58:12 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: 100.0 MB required (including padding), 3.44 GB available
// Apr 21 07:58:12 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: Waiting for index to be ready (101)
// Apr 21 07:59:55 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: 1.75 GB required (including padding), 3.44 GB available
// Apr 21 07:59:42 heracles /USR/SBIN/CRON[2474]: (root) CMD (  nice -n 19 /etc/cron.daily/ntpdate &> /dev/null)
// Apr 21 07:59:47 heracles ntpdate[2477]: no server suitable for synchronization found
// Apr 21 08:00:12 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: Copied 1007 files (84 KB) from volume Macintosh HD.
// Apr 21 08:00:13 Dave-Thomass-MacBook-Air mds[24153]: (Error) Volume: Could not find requested backup type:2 for volume
// Apr 21 08:00:13 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: Starting post-backup thinning
// Apr 21 08:00:30 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: Deleted /Volumes/Time Machine Backups/Backups.backupdb/Dave Thomas's MacBook Air/2013-04-20-070002 (4.0 MB)
// Apr 21 08:00:30 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: Post-back up thinning complete: 1 expired backups removed
// Apr 21 08:00:31 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: Backup completed successfully.
// Apr 21 08:00:37 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: Ejected Time Machine disk image.
// Apr 21 08:00:38 Dave-Thomass-MacBook-Air com.apple.backupd[31413]: Ejected Time Machine network volume.

INTEGER: '0'..'9'+;
DECIMAL: '0'..'9'+ '.' ('0'..'9')*;
WORD: ('a'..'z'|'A'..'Z' | '_')*;
IP: '0'..'9'+ '.' ('0'..'9')+ '.' ('0'..'9')+ '.' ('0'..'9');
HOSTNAME: ('a'..'z'|'A'..'Z' | '_' | '-')*;
TIME: '0'..'9' '0'..'9' ':' '0'..'9' '0'..'9' ':' '0'..'9' '0'..'9';
GIBBERISH_ENDING_IN_COLON: ('!'..'~')+ ':';
GIBBERISH: ('!'..'~')+;
WS: ( ' '| '\t' ) {$channel=HIDDEN;};

anything returns [String anyOut]: (any=(INTEGER|DECIMAL|WORD|IP|HOSTNAME|GIBBERISH_ENDING_IN_COLON|GIBBERISH)
	{	
		if($anyOut==null){
			$anyOut=$any.text;
		}else{
			$anyOut += " " + $any.text;
		}		
	})+;


logentry: month=WORD day=INTEGER time=TIME host=(WORD|HOSTNAME|IP) service=GIBBERISH_ENDING_IN_COLON anything '\n'
	{
		System.out.println($host.text + " logged " + $anything.anyOut);
	};
	
log: logentry* EOF;
