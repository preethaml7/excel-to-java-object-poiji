package com.preethaml7.poiji;

import com.poiji.bind.Poiji;
import com.preethaml7.poiji.model.Sales;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.List;

@SpringBootApplication
public class Application implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        List<Sales> salesList = Poiji.fromExcel(new File("src/main/resources/sales.xls"), Sales.class);

        float profitTotal = 0.0F;
        for (Sales sales : salesList) {

            System.out.println("Sales Data: " + sales);
            profitTotal = profitTotal + Float.parseFloat(sales.getProfit());

        }

        System.out.println("Profit Total: " + profitTotal);
        System.out.println("Sales Data Size: " + salesList.size());
    }
}
