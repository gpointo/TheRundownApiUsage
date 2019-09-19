package nfl_api_pojo;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"team_id",
"name",
"mascot",
"abbreviation",
"is_away",
"is_home",
"ranking",
"record"
})
public class TeamsNormalized {

@JsonProperty("team_id")
private Long teamId;
@JsonProperty("name")
private String name;
@JsonProperty("mascot")
private String mascot;
@JsonProperty("abbreviation")
private String abbreviation;
@JsonProperty("is_away")
private Boolean isAway;
@JsonProperty("is_home")
private Boolean isHome;
@JsonProperty("ranking")
private String ranking;
@JsonProperty("record")
private String record;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("team_id")
public Long getTeamId() {
return teamId;
}

@JsonProperty("team_id")
public void setTeamId(Long teamId) {
this.teamId = teamId;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("mascot")
public String getMascot() {
return mascot;
}

@JsonProperty("mascot")
public void setMascot(String mascot) {
this.mascot = mascot;
}

@JsonProperty("abbreviation")
public String getAbbreviation() {
return abbreviation;
}

@JsonProperty("abbreviation")
public void setAbbreviation(String abbreviation) {
this.abbreviation = abbreviation;
}

@JsonProperty("is_away")
public Boolean getIsAway() {
return isAway;
}

@JsonProperty("is_away")
public void setIsAway(Boolean isAway) {
this.isAway = isAway;
}

@JsonProperty("is_home")
public Boolean getIsHome() {
return isHome;
}

@JsonProperty("is_home")
public void setIsHome(Boolean isHome) {
this.isHome = isHome;
}

@JsonProperty("ranking")
public String getRanking() {
return ranking;
}

@JsonProperty("ranking")
public void setRanking(String ranking) {
this.ranking = ranking;
}

@JsonProperty("record")
public String getRecord() {
return record;
}

@JsonProperty("record")
public void setRecord(String record) {
this.record = record;
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