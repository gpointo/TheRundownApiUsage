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
"team_normalized_id",
"is_away",
"is_home",
"name"
})
public class Team {

@JsonProperty("team_id")
private Long teamId;
@JsonProperty("team_normalized_id")
private Long teamNormalizedId;
@JsonProperty("is_away")
private Boolean isAway;
@JsonProperty("is_home")
private Boolean isHome;
@JsonProperty("name")
private String name;
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

@JsonProperty("team_normalized_id")
public Long getTeamNormalizedId() {
return teamNormalizedId;
}

@JsonProperty("team_normalized_id")
public void setTeamNormalizedId(Long teamNormalizedId) {
this.teamNormalizedId = teamNormalizedId;
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

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
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