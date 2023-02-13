package cn.edu.guet.springbootdemo.service;

import cn.edu.guet.springbootdemo.bean.PurchaseContract;
import cn.edu.guet.springbootdemo.bean.PurchasePaymentContract;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 钟荣钊
 * @Date 2023/02/13
 * @Version 1.0
 */

@Service
public interface PurchaseService {
    List<PurchaseContract> getAllPurchaseContract();
    List<PurchaseContract> getPurchaseContractById(int id);
    void addPurchaseContract(PurchaseContract purchaseContract);
    void updatePurchaseContract(PurchaseContract purchaseContract);
    void deletePurchaseContractById(int id);


    List<PurchaseContract> getPurchasePaymentContract();
    void deletePurchasePaymentContractById(int id);
    void addPurchasePaymentContract(PurchasePaymentContract purchasePaymentContract);


    List<PurchaseContract> getPurchaseDirectorState();
}
