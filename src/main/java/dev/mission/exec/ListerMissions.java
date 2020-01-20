package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;


public class ListerMissions implements Runnable {
	private MissionRepository missionRepository;

	public ListerMissions(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
		
	}

	@Override
	public void run() {
		
	List<Mission> listmissions = this.missionRepository.findAll();
	for (Mission m : listmissions) {
		System.out.println(m.getLibelle());
	}
	}
	
}