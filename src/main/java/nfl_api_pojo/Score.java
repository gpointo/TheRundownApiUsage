package nfl_api_pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"event_id",
"event_status",
"score_away",
"score_home",
"winner_away",
"winner_home",
"score_away_by_period",
"score_home_by_period",
"venue_name",
"venue_location",
"game_clock",
"display_clock",
"game_period",
"broadcast",
"event_status_detail"
})
public class Score {

@JsonProperty("event_id")
private String eventId;
@JsonProperty("event_status")
private String eventStatus;
@JsonProperty("score_away")
private Long scoreAway;
@JsonProperty("score_home")
private Long scoreHome;
@JsonProperty("winner_away")
private Long winnerAway;
@JsonProperty("winner_home")
private Long winnerHome;
@JsonProperty("score_away_by_period")
private List<Long> scoreAwayByPeriod = null;
@JsonProperty("score_home_by_period")
private List<Long> scoreHomeByPeriod = null;
@JsonProperty("venue_name")
private String venueName;
@JsonProperty("venue_location")
private String venueLocation;
@JsonProperty("game_clock")
private Long gameClock;
@JsonProperty("display_clock")
private String displayClock;
@JsonProperty("game_period")
private Long gamePeriod;
@JsonProperty("broadcast")
private String broadcast;
@JsonProperty("event_status_detail")
private String eventStatusDetail;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("event_id")
public String getEventId() {
return eventId;
}

@JsonProperty("event_id")
public void setEventId(String eventId) {
this.eventId = eventId;
}

@JsonProperty("event_status")
public String getEventStatus() {
return eventStatus;
}

@JsonProperty("event_status")
public void setEventStatus(String eventStatus) {
this.eventStatus = eventStatus;
}

@JsonProperty("score_away")
public Long getScoreAway() {
return scoreAway;
}

@JsonProperty("score_away")
public void setScoreAway(Long scoreAway) {
this.scoreAway = scoreAway;
}

@JsonProperty("score_home")
public Long getScoreHome() {
return scoreHome;
}

@JsonProperty("score_home")
public void setScoreHome(Long scoreHome) {
this.scoreHome = scoreHome;
}

@JsonProperty("winner_away")
public Long getWinnerAway() {
return winnerAway;
}

@JsonProperty("winner_away")
public void setWinnerAway(Long winnerAway) {
this.winnerAway = winnerAway;
}

@JsonProperty("winner_home")
public Long getWinnerHome() {
return winnerHome;
}

@JsonProperty("winner_home")
public void setWinnerHome(Long winnerHome) {
this.winnerHome = winnerHome;
}

@JsonProperty("score_away_by_period")
public List<Long> getScoreAwayByPeriod() {
return scoreAwayByPeriod;
}

@JsonProperty("score_away_by_period")
public void setScoreAwayByPeriod(List<Long> scoreAwayByPeriod) {
this.scoreAwayByPeriod = scoreAwayByPeriod;
}

@JsonProperty("score_home_by_period")
public List<Long> getScoreHomeByPeriod() {
return scoreHomeByPeriod;
}

@JsonProperty("score_home_by_period")
public void setScoreHomeByPeriod(List<Long> scoreHomeByPeriod) {
this.scoreHomeByPeriod = scoreHomeByPeriod;
}

@JsonProperty("venue_name")
public String getVenueName() {
return venueName;
}

@JsonProperty("venue_name")
public void setVenueName(String venueName) {
this.venueName = venueName;
}

@JsonProperty("venue_location")
public String getVenueLocation() {
return venueLocation;
}

@JsonProperty("venue_location")
public void setVenueLocation(String venueLocation) {
this.venueLocation = venueLocation;
}

@JsonProperty("game_clock")
public Long getGameClock() {
return gameClock;
}

@JsonProperty("game_clock")
public void setGameClock(Long gameClock) {
this.gameClock = gameClock;
}

@JsonProperty("display_clock")
public String getDisplayClock() {
return displayClock;
}

@JsonProperty("display_clock")
public void setDisplayClock(String displayClock) {
this.displayClock = displayClock;
}

@JsonProperty("game_period")
public Long getGamePeriod() {
return gamePeriod;
}

@JsonProperty("game_period")
public void setGamePeriod(Long gamePeriod) {
this.gamePeriod = gamePeriod;
}

@JsonProperty("broadcast")
public String getBroadcast() {
return broadcast;
}

@JsonProperty("broadcast")
public void setBroadcast(String broadcast) {
this.broadcast = broadcast;
}

@JsonProperty("event_status_detail")
public String getEventStatusDetail() {
return eventStatusDetail;
}

@JsonProperty("event_status_detail")
public void setEventStatusDetail(String eventStatusDetail) {
this.eventStatusDetail = eventStatusDetail;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
