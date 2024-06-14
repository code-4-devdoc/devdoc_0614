package code.four.devdoc;

import code.four.devdoc.model.Award;
import code.four.devdoc.model.PersonalInfo;
import code.four.devdoc.model.Resume;
import code.four.devdoc.repository.AwardRepository;
import code.four.devdoc.repository.PersonalInfoRepository;
import code.four.devdoc.repository.ResumeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

@SpringBootApplication
public class DevdocApplication implements CommandLineRunner {
		private static final Logger logger = LoggerFactory.getLogger(DevdocApplication.class);

	@Autowired
	private ResumeRepository resumeRepository;

	@Autowired
	private AwardRepository awardRepository;

	@Autowired
	private PersonalInfoRepository personalInfoRepository;

		public static void main(String[] args) {
		SpringApplication.run(DevdocApplication.class, args);
	}

		@Override
		public void run(String... args) throws Exception {

			Resume resume1 = new Resume("My Resume");
			resumeRepository.saveAll(Arrays.asList(resume1));

			PersonalInfo personalInfo1 = new PersonalInfo("Lee kwan jin", "010-4321-8765", resume1);
			personalInfoRepository.saveAll(Arrays.asList(personalInfo1));

			Award award1 = new Award("2023 hackathon", resume1);
			awardRepository.saveAll(Arrays.asList(award1));
		}
}
