package cn.edu.guet.springbootdemo.service;

import cn.edu.guet.springbootdemo.bean.Company;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/02/12
 * @Version 17.0.5
 */

public interface CompanyService {
    List<Company> getAllCompany();
    void addCompany(Company company);
    void updateCompany(Company company);
    void deleteCompanyById(int id);
    List<Company> getCompanyListByPage(int fromIndex,int pageSize);

    int getCompanyListTotalPage();
    int searchCompanyListTotalPage(String name);
    List<Company> searchCompanyList(String name,int fromIndex,int pageSize);
}
