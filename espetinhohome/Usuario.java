package com.example.demetrius.espetinhohome;

import java.io.Serializable;

/**
 * Created by Demetrius on 12/08/2016.
 */
public class Usuario implements Serializable{
    private String total;
    private String total2;
    private String total3;
    private String total4;
    private String total5;
    private int quantidade;
    private int quantidade2;
    private int quantidade3;
    private int quantidade4;
    private int quantidade5;
    private int valorUni1;
    private int valorUni2;
    private int valorUni3;
    private int valorUni4;
    private int valorUni5;
    private int valorPagamento;
    private static final long serialversionUID= 1L;


    public Usuario(String total) {
        this.total = total;
    }

    public Usuario() {

    }

    public Usuario(String total, int quantidade) {
        this.total = total;
        this.quantidade = quantidade;
    }

    public Usuario(String total, String total2, String total3, String total4, String total5, int quantidade, int quantidade2, int quantidade3, int quantidade4, int quantidade5, int valorUni1, int valorUni2, int valorUni3, int valorUni4, int valorUni5, int valorPagamento) {
        this.total = total;
        this.total2 = total2;
        this.total3 = total3;
        this.total4 = total4;
        this.total5 = total5;
        this.quantidade = quantidade;
        this.quantidade2 = quantidade2;
        this.quantidade3 = quantidade3;
        this.quantidade4 = quantidade4;
        this.quantidade5 = quantidade5;
        this.valorUni1 = valorUni1;
        this.valorUni2 = valorUni2;
        this.valorUni3 = valorUni3;
        this.valorUni4 = valorUni4;
        this.valorUni5 = valorUni5;
        this.valorPagamento = valorPagamento;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal2() {
        return total2;
    }

    public void setTotal2(String total2) {
        this.total2 = total2;
    }

    public String getTotal3() {
        return total3;
    }

    public void setTotal3(String total3) {
        this.total3 = total3;
    }

    public String getTotal4() {
        return total4;
    }

    public void setTotal4(String total4) {
        this.total4 = total4;
    }

    public String getTotal5() {
        return total5;
    }

    public void setTotal5(String total5) {
        this.total5 = total5;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade2() {
        return quantidade2;
    }

    public void setQuantidade2(int quantidade2) {
        this.quantidade2 = quantidade2;
    }

    public int getQuantidade3() {
        return quantidade3;
    }

    public void setQuantidade3(int quantidade3) {
        this.quantidade3 = quantidade3;
    }

    public int getQuantidade4() {
        return quantidade4;
    }

    public void setQuantidade4(int quantidade4) {
        this.quantidade4 = quantidade4;
    }

    public int getQuantidade5() {
        return quantidade5;
    }

    public void setQuantidade5(int quantidade5) {
        this.quantidade5 = quantidade5;
    }

    public int getValorUni1() {
        return valorUni1;
    }

    public void setValorUni1(int valorUni1) {
        this.valorUni1 = valorUni1;
    }

    public int getValorUni2() {
        return valorUni2;
    }

    public void setValorUni2(int valorUni2) {
        this.valorUni2 = valorUni2;
    }

    public int getValorUni3() {
        return valorUni3;
    }

    public void setValorUni3(int valorUni3) {
        this.valorUni3 = valorUni3;
    }

    public int getValorUni4() {
        return valorUni4;
    }

    public void setValorUni4(int valorUni4) {
        this.valorUni4 = valorUni4;
    }

    public int getValorUni5() {
        return valorUni5;
    }

    public void setValorUni5(int valorUni5) {
        this.valorUni5 = valorUni5;
    }

    public int getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(int valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "total='" + total + '\'' +
                ", total2='" + total2 + '\'' +
                ", total3='" + total3 + '\'' +
                ", total4='" + total4 + '\'' +
                ", total5='" + total5 + '\'' +
                ", quantidade=" + quantidade +
                ", quantidade2=" + quantidade2 +
                ", quantidade3=" + quantidade3 +
                ", quantidade4=" + quantidade4 +
                ", quantidade5=" + quantidade5 +
                ", valorUni1=" + valorUni1 +
                ", valorUni2=" + valorUni2 +
                ", valorUni3=" + valorUni3 +
                ", valorUni4=" + valorUni4 +
                ", valorUni5=" + valorUni5 +
                ", valorPagamento=" + valorPagamento +
                '}';
    }
}
