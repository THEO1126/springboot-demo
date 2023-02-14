package cn.edu.guet.springbootdemo.service.Impl;

import cn.edu.guet.springbootdemo.bean.Company;
import cn.edu.guet.springbootdemo.mapper.CompanyMapper;
import cn.edu.guet.springbootdemo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/02/12
 * @Version 17.0.5
 */

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    CompanyMapper companyMapper;

    @Override
    public List<Company> getAllCompany() {
        return companyMapper.getAllCompany();
    }

    @Override
    public void addCompany(Company company) {
        companyMapper.addCompany(company);
    }

    @Override
    public void updateCompany(Company company) {
        companyMapper.updateCompany(company);
    }

    @Override
    public void deleteCompanyById(int id) {
        companyMapper.deleteCompanyById(id);
    }

    @Override
    public List<Company> getCompanyListByPage(int fromIndex, int pageSize) {
        return companyMapper.getCompanyListByPage(fromIndex,pageSize);
    }

    @Override
    public int getCompanyListTotalPage() {
        return companyMapper.getCompanyListTotalPage();
    }

    @Override
    public int searchCompanyListTotalPage(String name) {
        return companyMapper.searchCompanyListTotalPage(name);
    }

    @Override
    public List<Company> searchCompanyList(String name, int fromIndex, int pageSize) {
        return companyMapper.searchCompanyList(name,fromIndex,pageSize);
    }
}
