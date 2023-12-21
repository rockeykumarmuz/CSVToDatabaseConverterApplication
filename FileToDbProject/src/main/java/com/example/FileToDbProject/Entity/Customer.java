package com.example.FileToDbProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String exchange;
    String exchangeSegment;
    String symbolCode;
    String tradingSymbol;
    String name;
    String lastPrice;
    String instrument;
    String lotSize;
    String strikePrice;
    String expiryDate;
    String tickSize;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", exchange='" + exchange + '\'' +
                ", exchangeSegment='" + exchangeSegment + '\'' +
                ", symbolCode='" + symbolCode + '\'' +
                ", tradingSymbol='" + tradingSymbol + '\'' +
                ", name='" + name + '\'' +
                ", lastPrice='" + lastPrice + '\'' +
                ", instrument='" + instrument + '\'' +
                ", lotSize='" + lotSize + '\'' +
                ", strikePrice='" + strikePrice + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", tickSize='" + tickSize + '\'' +
                '}';
    }

}
