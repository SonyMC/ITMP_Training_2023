# Docker

## Images

You can reuse these images instead of creating and pushing new container images

- Currency Exchange Service 
	- v11 - mailsonymathew/mmv2-docker-currency-exchange-service-kubernetes:0.0.11-SNAPSHOT
    - v12 - mailsonymathew/mmv2-docker-currency-exchange-service-kubernetes:0.0.12-SNAPSHOT
	
	mailsonymathew/aws-currency-exchange-service-aws-kubernetes:0.0.12-SNAPSHOT
	
- Currency Conversion Service
	- mailsonymathew/mmv2-docker-currency-conversion-service-kubernetes:0.0.11-SNAPSHOT
    - Uses CURRENCY_EXCHANGE_SERVICE_HOST
  - in28min/mmv2-currency-conversion-service:0.0.12-SNAPSHOT
    - mailsonymathew/mmv2-docker-currency-conversion-service-kubernetes:0.0.12-SNAPSHOT
	
	mailsonymathew/maws-currency-conversion-service-aws-kubernetes:0.0.12-SNAPSHOT

## URLS

#### Currency Exchange Service
- http://localhost:8000/currency-exchange/from/USD/to/INR

#### Currency Conversion Service
- http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10



```