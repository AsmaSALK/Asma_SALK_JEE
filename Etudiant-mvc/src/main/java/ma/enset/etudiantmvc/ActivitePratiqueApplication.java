package ma.enset.etudiantmvc;

import ma.enset.etudiantmvc.entities.Etudiant;
import ma.enset.etudiantmvc.entities.Genre;
import ma.enset.etudiantmvc.repositories.EtudiantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ActivitePratiqueApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActivitePratiqueApplication.class, args);

    }
    @Bean
    CommandLineRunner commandLineRunner(EtudiantRepository etudiantRepository){
        return args -> {
            etudiantRepository.save(
                    new Etudiant(null,"SALK","Asma","asmaasalk@gmail.com",new Date(), Genre.feminin,true)
            );
            etudiantRepository.save(
                    new Etudiant(null,"SALK","Nazha","asmaasalk@gmail.com",new Date(), Genre.feminin,true)
            );
            etudiantRepository.save(
                    new Etudiant(null,"ZIANI","Rihab","asmaasalk@gmail.com",new Date(), Genre.feminin,true)
            );
            etudiantRepository.save(
                    new Etudiant(null,"ZIANI","Aymane","asmaasalk@gmail.com",new Date(), Genre.masculin,false)
            );
            etudiantRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }
}
