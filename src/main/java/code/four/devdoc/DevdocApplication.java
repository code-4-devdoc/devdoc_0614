package code.four.devdoc;

import code.four.devdoc.model.Award;
import code.four.devdoc.model.PersonalInfo;
import code.four.devdoc.model.Resume;
import code.four.devdoc.model.User;
import code.four.devdoc.repository.AwardRepository;
import code.four.devdoc.repository.PersonalInfoRepository;
import code.four.devdoc.repository.ResumeRepository;
import code.four.devdoc.repository.UserRepository;
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

	@Autowired
	private UserRepository userRepository;

		public static void main(String[] args) {
		SpringApplication.run(DevdocApplication.class, args);
	}

		@Override
		public void run(String... args) throws Exception {

			Resume resume1 = new Resume("My Resume");
			resumeRepository.saveAll(Arrays.asList(resume1));

			PersonalInfo personalInfo1 = new PersonalInfo("Lee kwan jin", "010-4321-8765", resume1);
			PersonalInfo personalInfo2 = new PersonalInfo("Kim min soo", "010-5232-3321", resume1);
			personalInfoRepository.saveAll(Arrays.asList(personalInfo1, personalInfo2));

			Award award1 = new Award("2023 hackathon", resume1);
			awardRepository.saveAll(Arrays.asList(award1));





			userRepository.save(new User("user",
					"$2y$10$hzRnP6dYDzXP7TCoFTApjeaB7X2I1H.800Qp8cI4SRPcbe9Ei/YEy","USER"));
			userRepository.save(new User("admin",
					"$2y$10$k4o1fF0DrulK50zfsEg3te2FRWZjy8eBDO5edsuDsIVNoJrbik0HK", "ADMIN"));


		}


}
