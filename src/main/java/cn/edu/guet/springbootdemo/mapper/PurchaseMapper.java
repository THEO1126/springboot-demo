package cn.edu.guet.springbootdemo.mapper;

import cn.edu.guet.springbootdemo.bean.PurchaseContract;
import cn.edu.guet.springbootdemo.bean.PurchasePaymentContract;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PurchaseMapper {
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
