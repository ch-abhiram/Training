package first.src.M1.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        getPaidOrders();
//        CountTotalOrders();
//        TotalRevenuePaid();
        HighestOrder();

    }
    public static void HighestOrder(){
        double res = getOrder().stream().mapToDouble(Order::getAmount).max().orElse(0);
        System.out.println(res);
        getOrder().stream().filter(o->o.getAmount() == res).forEach(System.out::println);
    }

    public static void getPaidOrders(){
//        Map<Boolean,List<Order>> res = getOrder().stream().collect(Collectors.partitioningBy(o->o.getStatus().equals("Paid")));
//        for(Map.Entry<Boolean,List<Order>> order: res.entrySet()){
//            if(order.getKey() == true){
//                List<Order> paid = order.getValue();
////                paid.stream()
////                .forEach(System.out::println);
//                for(Order o: paid){
//                    System.out.println(o.getCustomerName()+" "+o.getStatus());
//                }
//            }
//        }
            getOrder().stream().filter(o->"Paid".equals(o.getStatus())).forEach(System.out::println);

    }

    public static void TotalRevenuePaid(){
//        Map<Boolean,List<Order>> res = getOrder().stream().collect(Collectors.partitioningBy(o->"Paid".equals(o.getStatus())));
//        for(Map.Entry<Boolean,List<Order>> order: res.entrySet()){
//            if(order.getKey() == true){
//                List<Order> paid = order.getValue();
////                paid.stream().mapToDouble(i->i.getAmount())
////                .forEach(System.out::println);
//                double total = 0;
//                for(Order o: paid){
//                    total += o.getAmount();
//
////                    System.out.println(o.getCustomerName()+" "+o.getStatus());
//                }
//                System.out.println(total);
//            }
//        }
        double res = getOrder().stream().
                filter(o->"Paid".equals(o.getStatus()))
                .mapToDouble(Order::getAmount).sum();
        System.out.println(res);

    }
    public static void CountTotalOrders(){
//        Long res = getOrder().stream().collect(Collectors.counting());
//        int res = getOrder().size();
        Long res = getOrder().stream().count();
        System.out.println(res);
    }

    public static List<Order> getOrder(){
        List<Order> orders = new ArrayList<>(Arrays.asList(
                new Order(101, "Amit", "Electronics", 15000.0, "Hyderabad", "Paid"),
                new Order(102, "Sneha", "Clothing", 2500.0, "Warangal", "Not Paid"),
                new Order(103, "Rahul", "Groceries", 1200.0, "Hyderabad", "Paid"),
                new Order(104, "Priya", "Electronics", 22000.0, "Bangalore", "Not Paid"),
                new Order(105, "Kiran", "Clothing", 4500.0, "Chennai", "Paid"),
                new Order(106, "Neha", "Groceries", 1800.0, "Warangal", "Not Paid"),
                new Order(107, "Arjun", "Electronics", 30000.0, "Hyderabad", "Paid"),
                new Order(108, "Divya", "Clothing", 3500.0, "Bangalore", "Paid")
        ));
        return  orders;
    }
}
