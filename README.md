# Ice Cream Shop – Heatwave Combat

A simple Java console application demonstrating the use of **Singleton**, **Factory** and **Decorator** design patterns in an interactive ice‑cream shop scenario.

---

## 🎯 Features

- **Singleton**  
  Ensures there is only one `IceCreamShop` instance.

- **Factory**  
  Creates different ice‑cream types (`Vanilla`, `Chocolate`, `Strawberry`) via `IceCreamFactory`.

- **Decorator**  
  Adds optional toppings (`Chocolate Sauce`, `Chocolate Chips`) at runtime.

- **Console UI**  
  Customers choose their ice‑cream and toppings in real time.

---

## 📂 Project Structure

```
icecream-shop/
├── src/
│   ├── factory/
│   │   ├── IceCreamFactory.java
│   │   └── IceCreamType.java
│   ├── icecream/
│   │   ├── IceCream.java
│   │   ├── VanillaIceCream.java
│   │   ├── ChocolateIceCream.java
│   │   ├── StrawberryIceCream.java
│   │   └── decorators/
│   │       ├── IceCreamDecorator.java
│   │       ├── ChocolateSauce.java
│   │       └── ChocolateChips.java
│   ├── shop/
│   │   └── IceCreamShop.java
│   └── Main.java
└── README.md
```

---

## 🚀 Getting Started

1. **Clone the repo**  
   ```bash
   git clone https://github.com/your-username/icecream-shop.git
   cd icecream-shop
   ```

2. **Compile**  
   ```bash
   javac -d out src/**/*.java
   ```

3. **Run**  
   ```bash
   java -cp out Main
   ```

---

## 💡 Usage Example

```
Welcome to the Ice Cream Shop!
Select ice cream:
1. Vanilla
2. Chocolate
3. Strawberry
0. Exit
> 1

Choose toppings:
1. Chocolate Sauce
2. Chocolate Chips
3. Both
0. None
> 3

Serving: Vanilla ice cream with chocolate sauce with chocolate chips
```

---

## 📚 Design Patterns

- **Singleton** (`IceCreamShop`)  
- **Factory** (`IceCreamFactory`)  
- **Decorator** (`IceCreamDecorator`, `ChocolateSauce`, `ChocolateChips`)  

---

## 🛠️ Build Tools

- **Java SE 8+** (no external dependencies)  
- Feel free to add a Maven or Gradle wrapper as needed.

---

## 🤝 Contributing

PRs and issues are welcome! Feel free to suggest improvements or new patterns.

---

## 📄 License

This project is released under the MIT License.