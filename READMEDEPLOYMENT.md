# 🚀Package Application (Server Setup)

## 🚀ADD maven Plugins to POV file 

### for lombok and mapstruct can run in diffrent envierment.


```bash
.\mvnw clean package
```
#  Why Use This Command?
| Purpose                        | Benefit                                 |
| ------------------------------ | --------------------------------------- |
| Build Java code                | Compiles and packages your app          |
| Clean old builds               | Avoids unexpected issues                |
| Use exact Maven version        | Consistent builds for all developers    |
| Skip installing Maven manually | Useful for new developers or CI systems |


### we use it before deploy it on production, this command make .jar fat
### has all information about our package in target file.we can run it anywhere with java.

```bash
java -jar target/store-1.0.0.jar
```