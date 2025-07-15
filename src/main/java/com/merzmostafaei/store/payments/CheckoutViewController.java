package com.merzmostafaei.store.payments;

import com.merzmostafaei.store.orders.Order;
import com.merzmostafaei.store.orders.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CheckoutViewController {

    private final OrderRepository orderRepository;

    @GetMapping("/checkout-success")
    public String showSuccessPage(@RequestParam("orderId") Long orderId, Model model) {
        Order order = orderRepository.findById(orderId).orElse(null);
        model.addAttribute("order", order);
        return "success"; // renders success.html
    }

    @GetMapping("/checkout-cancel")
    public String showCancelPage() {
        return "cancel"; // optional: create cancel.html for this
    }
}
