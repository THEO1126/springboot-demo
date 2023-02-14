package cn.edu.guet.springbootdemo.controller;

import cn.edu.guet.springbootdemo.bean.PurchaseContract;
import cn.edu.guet.springbootdemo.bean.PurchasePaymentContract;
import cn.edu.guet.springbootdemo.bean.Result;
import cn.edu.guet.springbootdemo.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 钟荣钊
 * @Date 2023/02/13
 * @Version 1.0
 */

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @RequestMapping("/getAllPurchaseContract")
    public Result getAllPurchaseContract(){
        List<PurchaseContract> purchaseContractList=purchaseService.getAllPurchaseContract();
        if (purchaseContractList!=null){
            return new Result(200,"所有采购单查询成功",purchaseContractList);
        }else {
            return new Result(201,"查询失败",null);
        }
    }

    @RequestMapping("/getPurchaseContractById")
    public Result getPurchaseContractById(int id){
        List<PurchaseContract> purchaseContract=purchaseService.getPurchaseContractById(id);
        if (purchaseContract!=null){
            return new Result(200,"采购单查询成功",purchaseContract);
        }else {
            return new Result(201, "查询失败", null);
        }
    }

    @RequestMapping("/addPurchaseContract")
    public Result addPurchaseContract(@RequestBody PurchaseContract purchaseContract){
        try {
            purchaseService.addPurchaseContract(purchaseContract);
            return new Result(200,"添加采购单成功",null);
        }catch (Exception e){
            return new Result(201,"添加采购单失败",null);
        }
    }

    @RequestMapping("/updatePurchaseContract")
    public Result updatePurchaseContract(@RequestBody PurchaseContract purchaseContract){
        try {
            purchaseService.updatePurchaseContract(purchaseContract);
            return new Result(200,"更新采购单成功",null);
        }catch (Exception e){
            return new Result(201,"更新采购单失败",null);
        }
    }

    @RequestMapping("/deletePurchaseContractById")
    public Result deletePurchaseContractById(int id){
        try {
            purchaseService.deletePurchaseContractById(id);
            return new Result(200,"删除采购单成功",null);
        }catch (Exception e){
            return new Result(201,"删除采购单失败",null);
        }
    }

    @RequestMapping("/getPurchasePaymentContract")
    public Result getPurchasePaymentContract(){
        List<PurchaseContract> purchaseContractList = purchaseService.getPurchasePaymentContract();
        if (purchaseContractList!=null){
            return new Result(200,"采购付款单查询成功",purchaseContractList);
        }else {
            return new Result(201,"采购付款单查询失败",null);
        }
    }

    @RequestMapping("/deletePurchasePaymentContractById")
    public Result deletePurchasePaymentContractById(int id){
        try{
            purchaseService.deletePurchasePaymentContractById(id);
            return new Result(200,"删除采购付款单成功",null);
        }catch (Exception e){
            return new Result(201,"删除采购付款单失败",null);
        }
    }

    @RequestMapping("/addPurchasePaymentContract")
    public Result addPurchasePaymentContract(@RequestBody PurchasePaymentContract purchasePaymentContract){
        try{
            purchaseService.addPurchasePaymentContract(purchasePaymentContract);
            return new Result(200,"添加采购付款单成功",null);
        }catch (Exception e){
            return new Result(201,"添加采购付款单失败",null);
        }
    }

    @RequestMapping("/getPurchaseDirectorState")
    public Result getPurchaseDirectorState(){
        List<PurchaseContract> purchaseContractList = purchaseService.getPurchaseDirectorState();
        if (purchaseContractList!=null){
            return new Result(200,"出纳/采购付款单查询成功",purchaseContractList);
        }else {
            return new Result(200,"出纳/采购付款单查询失败",null);
        }
    }
}
