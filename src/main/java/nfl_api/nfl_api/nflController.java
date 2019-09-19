package nfl_api.nfl_api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nfl_api_service.NFLService;

@RestController
public class nflController {
public static final org.slf4j.Logger logger = LoggerFactory.getLogger(nflController.class);
@RequestMapping(value="/nflScores", method= RequestMethod.GET)
public ResponseEntity<Object> getNflScores(HttpServletRequest httpReq) throws IOException{
	Nfl_game_data Nfl_data = new Nfl_game_data();
	NFLService nfl = new NFLService();
	 nfl.getScoreHistory();
	return new ResponseEntity<Object>(Nfl_data.getNFLApi().body().string(),HttpStatus.OK);
	
}


}
