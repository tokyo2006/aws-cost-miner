package com.rbittencourt.aws.cost.miner.fixture;

import com.rbittencourt.aws.cost.miner.domain.billing.BillingInfo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BillingInfoFixture {

    private BillingInfo billingInfo = new BillingInfo();

    public static BillingInfoFixture get() {
        return new BillingInfoFixture();
    }

    public BillingInfo build() {
        return this.billingInfo;
    }

    public BillingInfoFixture withProductName(String productName) {
        this.billingInfo.setProductName(productName);
        return this;
    }

    public BillingInfoFixture withAvailabilityZone(String availabilityZone) {
        this.billingInfo.setAvailabilityZone(availabilityZone);
        return this;
    }

    public BillingInfoFixture withCost(double cost) {
        this.billingInfo.setCost(new BigDecimal(cost));
        return this;
    }

    public BillingInfoFixture withUsageType(String usageType) {
        this.billingInfo.setUsageType(usageType);
        return this;
    }

    public BillingInfoFixture withUsageStartDate(LocalDateTime usageStartDate) {
        this.billingInfo.setUsageStartDate(usageStartDate);
        return this;
    }

}
