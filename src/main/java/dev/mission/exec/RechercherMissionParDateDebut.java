package dev.mission.exec;

import org.springframework.stereotype.Controller;
import dev.mission.repository.MissionRepository;
import java.time.LocalDate;

@Controller
public class RechercherMissionParDateDebut implements Runnable {
	private MissionRepository missionRepository;

	public RechercherMissionParDateDebut(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		LocalDate dateDebutRecherche = LocalDate.of(2019, 1, 1);
		missionRepository.findByDateDebut(dateDebutRecherche);
	}
}