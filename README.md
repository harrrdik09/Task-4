# 📄 Task-4 – CSV File Filter in Java

## 📌 Overview
This Java program reads product data from a **CSV file (`product.csv`)** and writes all products with a **price greater than 1000** into another CSV file (`Target.csv`).  

It demonstrates the use of:
- `BufferedReader` → to read data from a CSV file  
- `FileWriter` (append mode) → to write filtered data into another file  
- String operations and parsing numbers from CSV  

---

## 📝 Input (`product.csv`)
```csv
ProductName,Price
Smartphone,1200
Headphones,850
Keyboard,900
Smartwatch,1500
Tablet,1300
Printer,1400
Monitor,1100
External Hard Drive,950
Wireless Router,1000
Gaming Mouse,850

## Output
Monitor 1100.0
Smartphone 1200.0
Smartwatch 1500.0
Tablet 1300.0
Printer 1400.0
Monitor 1100.0

