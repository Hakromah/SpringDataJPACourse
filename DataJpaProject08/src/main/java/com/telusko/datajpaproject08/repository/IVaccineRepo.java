package com.telusko.datajpaproject08.repository;

import com.telusko.datajpaproject08.entity.Vaccine;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

    //@Query("FROM Vaccine WHERE vaccineCompany=: company")
    //public List<Vaccine> searchVaccineCompanyName(String company);
    //OR
    @Query("FROM Vaccine WHERE vaccineCompany=: company")
    public List<Vaccine> searchByVaccineCompanyName(@Param("company") String cp);

    @Query("FROM Vaccine WHERE vaccineCompany IN (: comp1, : comp2)")
    public List<Vaccine> searchByVaccineCompanyName(String comp1, String comp2);

    @Query("SELECT vaccineName, vaccineCompany FROM Vaccine WHERE price BETWEEN : minp AND : maxp")
    public List<String> searchByVaccinePriceRange(Double minp, Double maxp);

    // FOR NON SELECT OPERATION
    @Transactional
    @Modifying
    @Query("UPDATE Vaccine SET price =: newPrice WHERE vaccineName =: vacName")
    public int updateVaccinePriceByVaccineName(Double newPrice, String vacName);

    @Transactional
    @Modifying
    @Query("DELETE Vaccine WHERE price BETWEEN :minP AND :maxP")
    public int deleteVaccinePriceRange(Double minP, Double maxP);

    // RAW SQL QUERY
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO vaccine_info(`id`,`price`,`vaccine_company`,`vaccine_name`) VALUES (?,?,?,?)", nativeQuery = true)
    public int insertVaccineDetails(Integer id, Double price, String vaccineCompany, String vaccineName);
}
