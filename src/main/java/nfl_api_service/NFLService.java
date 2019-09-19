package nfl_api_service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import nfl_api.nfl_api.Nfl_game_data;
import nfl_api.nfl_api.nflController;
import nfl_api_pojo.Event;
import nfl_api_pojo.Events;
import nfl_api_pojo.Team;

public class NFLService {
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(nflController.class);
	//	public ScoreHistory getScoreHistory() throws IOException {
	public void getScoreHistory() throws IOException {
		Nfl_game_data Nfl_data = new Nfl_game_data();
		String NFLdata = Nfl_data.getNFLApi().body().string();
		ObjectMapper objectMapper = new ObjectMapper();


		Events events = objectMapper.readValue(NFLdata, Events.class);
		List<Event> eventsArray = events.getEvents();
		int count=0;
		for(Event event:eventsArray){
			System.out.println("/n \n #"+count+" #EventID : "+event.getEventId());
			System.out.println("Away Score: "+event.getScore().getScoreAway()+" Home Score: "+event.getScore().getScoreHome());
			if(event.getScore().getWinnerAway()>event.getScore().getWinnerHome()){
				System.out.println("Away Team Wins");
			}else{
				System.out.println("Home Team Wins");
			}
			List<Team> teams = event.getTeams();
			String teamHomeAway;
			Long teamHomeAwayScore;
			for(Team team:teams){
				
				if(team.getIsAway()){
					teamHomeAway="Away Team: ";
					 teamHomeAwayScore = event.getScore().getScoreAway();
				}else{
					teamHomeAway="Home Team: ";
					 teamHomeAwayScore = event.getScore().getScoreHome();
				}
				System.out.println(teamHomeAway+team.getName()+" Points Scored: "+teamHomeAwayScore);
			}
			count++;
		}
		};
		
		
		
	}

