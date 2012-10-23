package com.peoplemerge.fileadapters;

public class TeamScore implements HasVariance{

	private final String teamName;
	private final int plays, wins, losses, draws, points, scoreAgainst, scoreFor;

	public TeamScore(String teamName, int plays, int wins, int losses,
			int draws, int scoreFor, int scoreAgainst, int points) {
		this.teamName = teamName;
		this.plays = plays;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
		this.scoreFor = scoreFor;
		this.scoreAgainst = scoreAgainst;
		this.points = points;
	}

	public String getTeamName() {
		return teamName;
	}

	public int getPlays() {
		return plays;
	}

	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public int getDraws() {
		return draws;
	}

	public int getScoreFor() {
		return scoreFor;
	}

	public int getScoreAgainst() {
		return scoreAgainst;
	}

	public int getPoints() {
		return points;
	}

	public int getVariance() {
		return (scoreFor - scoreAgainst > 0) ? scoreFor - scoreAgainst
				: scoreAgainst - scoreFor;
	}
	
	public Object getKey(){
		return getTeamName();
	}

}
