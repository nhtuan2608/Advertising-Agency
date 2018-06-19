CREATE  TABLE account (
  accountid BigInt(20) NOT NULL PRIMARY KEY AUTO_INCREMENT ,
  username VARCHAR(20) NOT NULL ,
  password VARCHAR(14) NOT NULL ,
  role varchar(15) NOT NULL
  );
  
  CREATE TABLE customer (
  CustomerID bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  CustomerName varchar(50) DEFAULT NULL,
  CustomerAddress varchar(50) DEFAULT NULL,
  CustomerEmail varchar(50) DEFAULT NULL,
  CustomerPhone varchar(15) DEFAULT NULL,
  CustomerStatus varchar(20) DEFAULT NULL
);

CREATE TABLE order (
  OrderID bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  CustomerID bigint(20) DEFAULT NULL,
  OrderStatus varchar(50) DEFAULT NULL,
  AccountID bigint(20) DEFAULT NULL,
  OrderDate date DEFAULT NULL,
  OrderRelease date DEFAULT NULL,
  PaymentStatus varchar(20) DEFAULT NULL
);

CREATE TABLE orderdetail (
  ORDERDETAILID bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  AdvertisingID bigint(20) NULL,
  QuantityOrder int(2) DEFAULT NULL,
  PriceOrder bigint(20) DEFAULT NULL,
  StatusOrder varchar(50) DEFAULT NULL,
  OrderID bigint(20)  NULL
);

CREATE TABLE advertising (
  advertisingID bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Description longtext,
  ImageAdv varchar(50) DEFAULT NULL,
  CreateDateAdv date DEFAULT NULL,
  QuantityAdv int(2) DEFAULT NULL,
  AdvertisingPriceID bigint(20) DEFAULT NULL,
  AdvertisingTypeID varchar(20) DEFAULT NULL
);

CREATE TABLE advertisingtype (
  AdvertisingTypeID varchar(20) NOT NULL PRIMARY KEY,
  NameType varchar(50) DEFAULT NULL,
  CreateDateType date DEFAULT NULL
);

CREATE TABLE advertisingpricelist (
  AdvertisingPriceID bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  AdvName varchar(50)  DEFAULT NULL,
  AdvLength varchar(3)  DEFAULT NULL,
  AdvWidth varchar(3) DEFAULT NULL,
  AdvSize varchar(4)  DEFAULT NULL,
  AdvPrice bigint(20) DEFAULT NULL,
  AdvPosition varchar(10) DEFAULT NULL,
  AdvPagePosition varchar(10) DEFAULT NULL,
  Form varchar(10)  DEFAULT NULL
);

ALTER TABLE `advertising`
  ADD KEY `FK_Advertising_AdvertisingPriceList` (`AdvertisingPriceID`),
  ADD KEY `FK_Advertising_AdvertisingType` (`AdvertisingTypeID`);
  
ALTER TABLE `order`
  ADD KEY `FK_Order_Acount` (`AccountID`),
  ADD KEY `FK_Order_Customer` (`CustomerID`);

ALTER TABLE `orderdetail`
  ADD KEY `FK_OrderDetail_Advertising` (`AdvertisingID`);
  
ALTER TABLE `advertising`
  ADD CONSTRAINT `FK_Advertising_AdvertisingPriceList` FOREIGN KEY (`AdvertisingPriceID`) REFERENCES `advertisingpricelist` (`AdvertisingPriceID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_Advertising_AdvertisingType` FOREIGN KEY (`AdvertisingTypeID`) REFERENCES `advertisingtype` (`AdvertisingTypeID`) ON DELETE NO ACTION ON UPDATE NO ACTION;


ALTER TABLE `order`
  ADD CONSTRAINT `FK_Order_Account` FOREIGN KEY (`AccountID`) REFERENCES `account` (`AccountId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_Order_Customer` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`) ON DELETE NO ACTION ON UPDATE NO ACTION;


ALTER TABLE `orderdetail`
  ADD CONSTRAINT `FK_OrderDetail_Advertising` FOREIGN KEY (`AdvertisingID`) REFERENCES `advertising` (`AdvertisingID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_OrderDetail_Order` FOREIGN KEY (`OrderID`) REFERENCES `order` (`OrderID`) ON DELETE NO ACTION ON UPDATE NO ACTION;
