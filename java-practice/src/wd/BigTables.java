package wd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class BigTables {
    private static double sumTrx = 0;
    private static double sum = 0;
    private static double sumTotal = 0;
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/bero.lomsadze/Downloads/table_size.txt");
        String[] tables = new String[] {"TRANSACTIONS",
                "PROVIDER_TRANSACTIONS",
                "OUTGOING_NOTIFICATIONS",
                "TRANSACTION_TRANSACTION_STATUS",
                "TRANSACTION_KPI",
                "DWH_TRANSFERS",
                "TRANSACTION_EXT_API",
                "TRANSACTION_EXT_REDIRECTS",
                "TRANSACTION_CUSTOM_FIELDS",
                "TRANSACTION_EXT_DATA",
                "DWH_TRANSFER_TRANSFER_STATUSES",
                "CARDHOLDERS",
                "TRANSACTION_EXT_CARDS",
                "TRANSACTION_NOTIFICATIONS",
                "GWI_SEND_TRANSACTIONS",
                "TRANSACTION_EXT_BROWSER",
                "TRANSACTION_EXT_PERIODIC",
                "TRANSACTION_EXT_ISO",
                "TRANSACTION_EXT_3D",
                "TRANSACTION_EXT_ORDER_ITEMS",
                "TRANSACTION_EXT_BANK_ACCOUNTS",
                "CARD_OWNER_MAPPING",
                "TRANSACTION_ALTERNATE_IDS",
                "TRANSACTION_EXT_MANDATES",
                "TRANSACTION_EXT_SEPA",
                "TRANSACTION_EXT_DEVICES",
                "TRANSACTION_EXT_SHIPPINGS",
                "TRANSACTION_EXT_WALLETS",
                "TRANSACTION_EXT_LIMITS",
                "TRANSACTION_EXT_ANALYTICS",
                "TRANSACTION_EXT_CONSUMERS",
                "ITINERARY_SEGMENTS",
                "TRANSACTION_EXT_AIRLINE",
                "TRANSACTION_EXT_SUB_MERCHANT_INFO",
                "CARD_BINS",
                "MULTI_PAYMENTS_TRANSACTIONS",
                "TRANSACTION_EXT_VOUCHER",
                "MULTI_PAYMENTS",
                "TRANSACTION_IN_PROGRESS",
                "MULTI_PAYMENTS_STATUSES",
                "TRAVEL_JOURNEYS",
                "MULTI_PAYMENTS_NOTIFICATIONS",
                "TRANSACTION_API_TRANSACTION_STATUS",
                "TRANSACTION_EXT_TRAVEL"};
        for (int i=0; i<tables.length; i++) {
            tables[i] = tables[i].toLowerCase();
        }

        List<String> list = Arrays.asList(tables);
        Files.lines(path).forEach(a -> {
            int indx = a.indexOf(" ");
            double value = Double.parseDouble(a.substring(indx+1));
            if (list.contains(a.substring(0, indx))) {
                sumTrx+=value;
            } else {
                sum+=value;
            }
            sumTotal+=value;
        });

        System.out.println("Total " +sumTotal);
        System.out.println("Sum Trx " +sumTrx);
        System.out.println("Sum Leftover " +sum);
        System.out.println(sumTrx + sum);
        if(sumTrx+sum == sumTotal)
            System.out.println(true);

    }
}
