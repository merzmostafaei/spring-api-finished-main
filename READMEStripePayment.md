## 🚀 Stripe Webhook Listener (Server Setup)

To forward Stripe webhook events to your local Spring Boot server, run:

```bash
./stripe listen --forward-to http://localhost:8080/checkout/webhook
```
This command will:

Start listening for Stripe events from the Stripe API

Forward all webhook events to your backend endpoint at /checkout/webhook

Make sure your Spring Boot server is running and listening at http://localhost:8080/checkout/webhook.

🧪 Triggering a Test Event (Client Simulation)
To simulate a successful payment event (like what would happen after checkout), use this command:

```bash
./stripe.exe trigger payment_intent.succeeded --add "payment_intent:metadata[order_id]=6"
```
This command will:

Trigger a payment_intent.succeeded event

Include an order_id metadata field with the value 6 in the payload

You can adjust the order_id value to match any test data you're using in your app.