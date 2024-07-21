package com.telusko.datajpaproject10;


import com.telusko.datajpaproject10.entity.JobSeeker;
import com.telusko.datajpaproject10.services.JobSeekerServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.io.*;
import java.time.LocalDate;
import java.util.Optional;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class DataJpaProject10Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject10Application.class, args);
        JobSeekerServiceImp service = container.getBean(JobSeekerServiceImp.class);

        // to store file and image to DB
        FileReader reader = null;
        FileInputStream inputStreams = null;
        char[] textFile = null;
        byte[] image = null;

        // TO get file and image from DB and store it somewhere
        FileWriter writer = null;
        FileOutputStream outputStream = null;

        Integer id = 1;
        Optional<JobSeeker> optional = service.searchSingleJobSeeker(id);

        if (optional.isPresent()) {
            JobSeeker job = optional.get();
            System.out.println(job.getId() + " " + job.getName() + " " + job.getCity() + " " + job.getDob());

            try {
                outputStream = new FileOutputStream("eggle.JPEG");
                outputStream.write(job.getImage());
                outputStream.flush();

                //Writer part
                writer = new FileWriter("personalInfo.txt");
                writer.write(job.getTextFile());

            } catch (FileNotFoundException e) {
                System.out.println("File not fund to be printed " + e);
            } catch (IOException e) {
                System.out.println("Image not found in the Database" + e);
            } finally {
                try {
                    assert writer != null;
                    writer.close();
                    outputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


//        try {
//            inputStreams = new FileInputStream("D:\\telusko\\images\\eggle.JPEG");
//            image = new byte[inputStreams.available()];
//            inputStreams.read(image);
//
//            File file = new File("D:\\telusko\\IO\\personalInfo.txt");
//            reader = new FileReader(file);
//            textFile = new char[(int) file.length()];
//            reader.read(textFile);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//                inputStreams.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//        JobSeeker js = new JobSeeker();
//        js.setName("Jacob");
//        js.setCity("London");
//        js.setDob(LocalDate.of(1995, 11, 10));
//        js.setImage(image);
//        js.setTextFile(textFile);
//
//        String status = service.regJobSeekerInfo(js);
//        System.out.println(status);

    }

}
