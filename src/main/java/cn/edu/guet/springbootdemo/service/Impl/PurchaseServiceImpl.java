package cn.edu.guet.springbootdemo.service.Impl;

import cn.edu.guet.springbootdemo.bean.PurchaseContract;
import cn.edu.guet.springbootdemo.bean.PurchasePaymentContract;
import cn.edu.guet.springbootdemo.mapper.PurchaseMapper;
import cn.edu.guet.springbootdemo.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 钟荣钊
 * @Date 2023/02/13
 * @Version 1.0
 */

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    public List<PurchaseContract> getAllPurchaseContract() {
        return purchaseMapper.getAllPurchaseContract();
    }

    @Override
    public List<PurchaseContract> getPurchaseContractById(int id) {
        return purchaseMapper.getPurchaseContractById(id);
    }

    @Override
    public void addPurchaseContract(PurchaseContract purchaseContract) {
        purchaseMapper.addPurchaseContract(purchaseContract);
    }

    @Override
    public void updatePurchaseContract(PurchaseContract purchaseContract) {
        purchaseMapper.updatePurchaseContract(purchaseContract);
    }

    @Override
    public void deletePurchaseContractById(int id) {
        purchaseMapper.deletePurchaseContractById(id);
    }

    @Override
    public List<PurchaseContract> getPurchasePaymentContract() {
        return purchaseMapper.getPurchasePaymentContract();
    }

    @Override
    public void deletePurchasePaymentContractById(int id) {
        purchaseMapper.deletePurchasePaymentContractById(id);
    }

    @Override
    public void addPurchasePaymentContract(PurchasePaymentContract purchasePaymentContract) {
        purchaseMapper.addPurchasePaymentContract(purchasePaymentContract);
    }

    @Override
    public List<PurchaseContract> getPurchaseDirectorState() {
        return purchaseMapper.getPurchaseDirectorState();
    }
}
