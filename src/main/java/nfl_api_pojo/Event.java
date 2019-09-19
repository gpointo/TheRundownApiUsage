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
"sport_id",
"event_date",
"rotation_number_away",
"rotation_number_home",
"score",
"teams",
"teams_normalized"
})
public class Event {

@JsonProperty("event_id")
private String eventId;
@JsonProperty("sport_id")
private Long sportId;
@JsonProperty("event_date")
private String eventDate;
@JsonProperty("rotation_number_away")
private Long rotationNumberAway;
@JsonProperty("rotation_number_home")
private Long rotationNumberHome;
@JsonProperty("score")
private Score score;
@JsonProperty("teams")
private List<Team> teams = null;
@JsonProperty("teams_normalized")
private List<TeamsNormalized> teamsNormalized = null;
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

@JsonProperty("sport_id")
public Long getSportId() {
return sportId;
}

@JsonProperty("sport_id")
public void setSportId(Long sportId) {
this.sportId = sportId;
}

@JsonProperty("event_date")
public String getEventDate() {
return eventDate;
}

@JsonProperty("event_date")
public void setEventDate(String eventDate) {
this.eventDate = eventDate;
}

@JsonProperty("rotation_number_away")
public Long getRotationNumberAway() {
return rotationNumberAway;
}

@JsonProperty("rotation_number_away")
public void setRotationNumberAway(Long rotationNumberAway) {
this.rotationNumberAway = rotationNumberAway;
}

@JsonProperty("rotation_number_home")
public Long getRotationNumberHome() {
return rotationNumberHome;
}

@JsonProperty("rotation_number_home")
public void setRotationNumberHome(Long rotationNumberHome) {
this.rotationNumberHome = rotationNumberHome;
}

@JsonProperty("score")
public Score getScore() {
return score;
}

@JsonProperty("score")
public void setScore(Score score) {
this.score = score;
}

@JsonProperty("teams")
public List<Team> getTeams() {
return teams;
}

@JsonProperty("teams")
public void setTeams(List<Team> teams) {
this.teams = teams;
}

@JsonProperty("teams_normalized")
public List<TeamsNormalized> getTeamsNormalized() {
return teamsNormalized;
}

@JsonProperty("teams_normalized")
public void setTeamsNormalized(List<TeamsNormalized> teamsNormalized) {
this.teamsNormalized = teamsNormalized;
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