CREATE TABLE Customer (
                          id Long AUTO_INCREMENT PRIMARY KEY,
                          email VARCHAR(255) NOT NULL,
                          name VARCHAR(255) NOT NULL,
                          mobile_number VARCHAR(20) NOT NULL,
                          created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          created_by INT,
                          updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                          updated_by INT
);

CREATE TABLE Accounts (
                          customer_id Long NOT NULL,
                          accountNumber Long AUTO_INCREMENT PRIMARY KEY,
                          branch_address VARCHAR(255) NOT NULL,
                          account_type VARCHAR(50) NOT NULL,
                          created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          created_by INT,
                          updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                          updated_by INT,
                          FOREIGN KEY (customer_id) REFERENCES Customer(id)
);
