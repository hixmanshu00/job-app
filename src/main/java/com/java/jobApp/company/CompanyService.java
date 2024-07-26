package com.java.jobApp.company;

import org.springframework.stereotype.Service;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    Boolean updateCompany(Long id, Company company);

    void createCompany(Company company);

    boolean deleteCompany(Long id);

    Company getCompany(Long id);
}
