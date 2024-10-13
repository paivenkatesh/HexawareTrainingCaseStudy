create database Car_connect;

use Car_connect;

CREATE TABLE Customer (
    CustomerID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL,
    PhoneNumber VARCHAR(15) NOT NULL,
    Address TEXT NOT NULL,
    Username VARCHAR(50) UNIQUE NOT NULL,
    Password VARCHAR(255) NOT NULL,
    RegistrationDate DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Vehicle (
    VehicleID INT PRIMARY KEY AUTO_INCREMENT,
    Model VARCHAR(50) NOT NULL,
    Make VARCHAR(50) NOT NULL,
    Year INT NOT NULL,
    Color VARCHAR(30) NOT NULL,
    RegistrationNumber VARCHAR(20) UNIQUE NOT NULL,
    Availability BOOLEAN DEFAULT TRUE,
    DailyRate DECIMAL(10, 2) NOT NULL
);

CREATE TABLE Reservation (
    ReservationID INT PRIMARY KEY AUTO_INCREMENT,
    CustomerID INT NOT NULL,
    VehicleID INT NOT NULL,
    StartDate DATETIME NOT NULL,
    EndDate DATETIME NOT NULL,
    TotalCost DECIMAL(10, 2) NOT NULL,
    Status ENUM('pending', 'confirmed', 'completed', 'cancelled') NOT NULL,
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID),
    FOREIGN KEY (VehicleID) REFERENCES Vehicle(VehicleID)
);


CREATE TABLE Admin (
    AdminID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL,
    PhoneNumber VARCHAR(15) NOT NULL,
    Username VARCHAR(50) UNIQUE NOT NULL,
    Password VARCHAR(255) NOT NULL,
    Role ENUM('super_admin', 'fleet_manager') NOT NULL,
    JoinDate DATETIME DEFAULT CURRENT_TIMESTAMP
);



INSERT INTO Customer (FirstName, LastName, Email, PhoneNumber, Address, Username, Password) VALUES
('Rahul', 'Sharma', 'rahul.sharma@email.com', '+91 9876543210', '123 MG Road, Bangalore', 'rahul_s', 'hashed_password_1'),
('Priya', 'Patel', 'priya.patel@email.com', '+91 8765432109', '456 Park Street, Mumbai', 'priya_p', 'hashed_password_2'),
('Amit', 'Singh', 'amit.singh@email.com', '+91 7654321098', '789 Jubilee Hills, Hyderabad', 'amit_s', 'hashed_password_3'),
('Deepa', 'Gupta', 'deepa.gupta@email.com', '+91 6543210987', '101 Civil Lines, Delhi', 'deepa_g', 'hashed_password_4'),
('Vikram', 'Reddy', 'vikram.reddy@email.com', '+91 5432109876', '202 Anna Nagar, Chennai', 'vikram_r', 'hashed_password_5'),
('Anita', 'Desai', 'anita.desai@email.com', '+91 4321098765', '303 Koregaon Park, Pune', 'anita_d', 'hashed_password_6'),
('Rajesh', 'Kumar', 'rajesh.kumar@email.com', '+91 3210987654', '404 Salt Lake, Kolkata', 'rajesh_k', 'hashed_password_7'),
('Sunita', 'Verma', 'sunita.verma@email.com', '+91 2109876543', '505 Gomti Nagar, Lucknow', 'sunita_v', 'hashed_password_8'),
('Karthik', 'Nair', 'karthik.nair@email.com', '+91 1098765432', '606 Miramar, Panaji', 'karthik_n', 'hashed_password_9'),
('Meera', 'Rao', 'meera.rao@email.com', '+91 9876543211', '707 Banjara Hills, Hyderabad', 'meera_r', 'hashed_password_10');

INSERT INTO Vehicle (Model, Make, Year, Color, RegistrationNumber, DailyRate) VALUES
('Swift', 'Maruti Suzuki', 2022, 'White', 'KA01AB1234', 1500.00),
('i20', 'Hyundai', 2021, 'Blue', 'MH02CD5678', 1700.00),
('Nexon', 'Tata', 2023, 'Orange', 'DL03EF9012', 2000.00),
('City', 'Honda', 2022, 'Silver', 'TN04GH3456', 2200.00),
('XUV700', 'Mahindra', 2023, 'Red', 'KL05IJ7890', 3000.00),
('Baleno', 'Maruti Suzuki', 2021, 'Gray', 'GJ06KL1234', 1600.00),
('Creta', 'Hyundai', 2022, 'Black', 'RJ07MN5678', 2500.00),
('Altroz', 'Tata', 2021, 'White', 'UP08OP9012', 1800.00),
('Verna', 'Hyundai', 2023, 'Blue', 'WB09QR3456', 2300.00),
('Thar', 'Mahindra', 2022, 'Green', 'HR10ST7890', 3500.00);

INSERT INTO Reservation (CustomerID, VehicleID, StartDate, EndDate, TotalCost, Status) VALUES
(1, 3, '2024-10-05 10:00:00', '2024-10-07 10:00:00', 4000.00, 'confirmed'),
(2, 1, '2024-10-10 09:00:00', '2024-10-12 09:00:00', 3000.00, 'pending'),
(3, 5, '2024-10-15 11:00:00', '2024-10-18 11:00:00', 9000.00, 'confirmed'),
(4, 2, '2024-10-20 08:00:00', '2024-10-21 08:00:00', 1700.00, 'completed'),
(5, 7, '2024-10-25 12:00:00', '2024-10-28 12:00:00', 7500.00, 'confirmed'),
(6, 4, '2024-11-01 10:00:00', '2024-11-03 10:00:00', 4400.00, 'pending'),
(7, 9, '2024-11-05 09:00:00', '2024-11-07 09:00:00', 4600.00, 'confirmed'),
(8, 6, '2024-11-10 11:00:00', '2024-11-11 11:00:00', 1600.00, 'cancelled'),
(9, 10, '2024-11-15 08:00:00', '2024-11-18 08:00:00', 10500.00, 'confirmed'),
(10, 8, '2024-11-20 12:00:00', '2024-11-22 12:00:00', 3600.00, 'pending');


INSERT INTO Admin (FirstName, LastName, Email, PhoneNumber, Username, Password, Role) VALUES
('Aditya', 'Chopra', 'aditya.chopra@carental.com', '+91 9876543200', 'aditya_admin', 'hashed_admin_pass_1', 'super_admin'),
('Neha', 'Kapoor', 'neha.kapoor@carental.com', '+91 8765432100', 'neha_admin', 'hashed_admin_pass_2', 'fleet_manager'),
('Sanjay', 'Mehta', 'sanjay.mehta@carental.com', '+91 7654321000', 'sanjay_admin', 'hashed_admin_pass_3', 'fleet_manager'),
('Pooja', 'Sharma', 'pooja.sharma@carental.com', '+91 6543210000', 'pooja_admin', 'hashed_admin_pass_4', 'fleet_manager'),
('Vivek', 'Malhotra', 'vivek.malhotra@carental.com', '+91 5432100000', 'vivek_admin', 'hashed_admin_pass_5', 'super_admin'),
('Anjali', 'Bhatia', 'anjali.bhatia@carental.com', '+91 4321000000', 'anjali_admin', 'hashed_admin_pass_6', 'fleet_manager'),
('Rohit', 'Khanna', 'rohit.khanna@carental.com', '+91 3210000000', 'rohit_admin', 'hashed_admin_pass_7', 'fleet_manager'),
('Kavita', 'Joshi', 'kavita.joshi@carental.com', '+91 2100000000', 'kavita_admin', 'hashed_admin_pass_8', 'fleet_manager'),
('Arjun', 'Saxena', 'arjun.saxena@carental.com', '+91 1000000000', 'arjun_admin', 'hashed_admin_pass_9', 'super_admin'),
('Divya', 'Agarwal', 'divya.agarwal@carental.com', '+91 9876543201', 'divya_admin', 'hashed_admin_pass_10', 'fleet_manager');

