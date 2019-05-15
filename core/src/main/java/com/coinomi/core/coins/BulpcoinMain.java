package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author main@m42.cx
 */
public class BulpcoinMain extends BitFamily {
    private BulpcoinMain() {
        id = "bulpcoin.main"; // Do not change this id as wallets serialize this string



        addressHeader = 26;
        p2shHeader = 10;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 198;

        name = "BulpCoin";
        symbol = "BULP";
        uriScheme = "bulpcoin";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 DASH mininput
        softDustLimit = value(5000); // 0.001 DASH
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Bulpcoin Signed Message:\n");

    }

    private static BulpcoinMain instance = new BulpcoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
