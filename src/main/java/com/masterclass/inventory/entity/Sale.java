package com.masterclass.inventory.entity;
import jakarta.persistence.*;import lombok.*;import java.math.BigDecimal;import java.time.OffsetDateTime;import java.util.*;
@Entity @Table(name="sales", indexes=@Index(name="ix_sales_date", columnList="sale_date")) @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Sale { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(name="sale_date",nullable=false) private OffsetDateTime saleDate; @Column(name="total_amount",nullable=false,precision=12,scale=2) private BigDecimal totalAmount; @OneToMany(mappedBy="sale", cascade=CascadeType.ALL, orphanRemoval=true) @Builder.Default private List<SaleDetail> details=new ArrayList<>(); public void addDetail(SaleDetail d){details.add(d); d.setSale(this);} }
