/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 5.6.12 : Database - own_app
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`own_app` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `own_app`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `adminId` varchar(20) NOT NULL COMMENT '超级管理员id，主键',
  `passWord` varchar(20) DEFAULT NULL COMMENT '密码',
  `realName` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `phoneNum` varchar(20) DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

insert  into `admin`(`adminId`,`passWord`,`realName`,`phoneNum`) values 
('admin','admin','管理员1','119');

/*Table structure for table `appuser` */

DROP TABLE IF EXISTS `appuser`;

CREATE TABLE `appuser` (
  `userId` varchar(15) NOT NULL COMMENT '用户id',
  `nickName` varchar(15) DEFAULT NULL COMMENT '用户昵称',
  `phoneNum` varchar(15) DEFAULT NULL COMMENT '用户手机号',
  `imgUrl` varchar(30) DEFAULT NULL COMMENT '用户头像地址',
  `cityName` varchar(10) DEFAULT NULL COMMENT '用户城市',
  `passWord` varchar(20) DEFAULT NULL COMMENT '密码',
  `carbonCoin` int(10) DEFAULT NULL COMMENT '碳币',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `appuser` */

insert  into `appuser`(`userId`,`nickName`,`phoneNum`,`imgUrl`,`cityName`,`passWord`,`carbonCoin`) values 
('1','wpx','1121212',NULL,'meishan','12345',100),
('2','lpf','352e523',NULL,'fuqing','11111',99);

/*Table structure for table `game_product` */

DROP TABLE IF EXISTS `game_product`;

CREATE TABLE `game_product` (
  `productId` int(11) NOT NULL COMMENT '产出物id',
  `windNum` int(11) DEFAULT NULL COMMENT '风能数量',
  `createdTime` datetime DEFAULT NULL COMMENT '产生时间',
  `windSrc` varchar(20) DEFAULT NULL COMMENT '产生来源',
  `electId` int(11) DEFAULT NULL COMMENT '电能数量',
  PRIMARY KEY (`productId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `game_product` */

/*Table structure for table `item` */

DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `itemId` varchar(20) NOT NULL COMMENT '商品id',
  `itemPrice` int(11) DEFAULT NULL COMMENT '商品价格',
  `itemType` varchar(20) DEFAULT NULL COMMENT '商品分类',
  `itemDesc` varchar(35) DEFAULT NULL COMMENT '商品描述',
  `inventory` int(11) DEFAULT NULL COMMENT '库存量',
  `itemName` varchar(20) DEFAULT NULL COMMENT '商品名称',
  PRIMARY KEY (`itemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `item` */

insert  into `item`(`itemId`,`itemPrice`,`itemType`,`itemDesc`,`inventory`,`itemName`) values 
('1',20,'1','手机',3,'mate30'),
('2',30,'2','衣服',2,'nike AF');

/*Table structure for table `land` */

DROP TABLE IF EXISTS `land`;

CREATE TABLE `land` (
  `landId` int(11) NOT NULL AUTO_INCREMENT COMMENT '游戏id，主键',
  `uid` int(11) DEFAULT NULL COMMENT '用户id',
  `windTotal` int(11) DEFAULT NULL COMMENT '风能数',
  `electricityTotal` int(11) DEFAULT NULL COMMENT '电能数',
  `windmillId` int(11) DEFAULT NULL COMMENT '参与的风车id',
  PRIMARY KEY (`landId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `land` */

/*Table structure for table `logging` */

DROP TABLE IF EXISTS `logging`;

CREATE TABLE `logging` (
  `logId` int(11) NOT NULL AUTO_INCREMENT COMMENT '日志id，主键',
  `opId` varchar(20) DEFAULT NULL COMMENT '执行的操作',
  `operatorId` varchar(20) DEFAULT NULL COMMENT '管理员id',
  PRIMARY KEY (`logId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `logging` */

/*Table structure for table `notify` */

DROP TABLE IF EXISTS `notify`;

CREATE TABLE `notify` (
  `notifyId` int(30) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `content` varchar(100) DEFAULT NULL,
  `type` int(10) DEFAULT NULL,
  `sendTime` date DEFAULT NULL,
  `fromAdmin` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`notifyId`),
  KEY `fromAdmin` (`fromAdmin`),
  CONSTRAINT `notify_ibfk_1` FOREIGN KEY (`fromAdmin`) REFERENCES `admin` (`adminId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `notify` */

insert  into `notify`(`notifyId`,`title`,`content`,`type`,`sendTime`,`fromAdmin`) values 
(1,'1','1',1,'2020-02-27','admin');

/*Table structure for table `notifyuser` */

DROP TABLE IF EXISTS `notifyuser`;

CREATE TABLE `notifyuser` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `uId` varchar(15) DEFAULT NULL,
  `nId` int(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `uId` (`uId`),
  KEY `nId` (`nId`),
  CONSTRAINT `notifyuser_ibfk_2` FOREIGN KEY (`nId`) REFERENCES `notify` (`notifyId`),
  CONSTRAINT `notifyuser_ibfk_1` FOREIGN KEY (`uId`) REFERENCES `appuser` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `notifyuser` */

insert  into `notifyuser`(`id`,`uId`,`nId`) values 
(1,'1',1);

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `orderId` varchar(15) NOT NULL COMMENT '订单id',
  `itemId` varchar(15) DEFAULT NULL COMMENT '商品id',
  `itemNum` int(11) DEFAULT NULL COMMENT '商品数量',
  `userId` varchar(15) DEFAULT NULL COMMENT '购买者id',
  `createTime` datetime DEFAULT NULL COMMENT '订单产生时间',
  PRIMARY KEY (`orderId`),
  KEY `itemId` (`itemId`),
  KEY `userId` (`userId`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`itemId`) REFERENCES `item` (`itemId`),
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `appuser` (`userId`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order` */

insert  into `order`(`orderId`,`itemId`,`itemNum`,`userId`,`createTime`) values 
('1','1',1,'2','2020-02-24 11:29:57'),
('2','2',2,'1','2020-02-04 11:30:12');

/*Table structure for table `props` */

DROP TABLE IF EXISTS `props`;

CREATE TABLE `props` (
  `propId` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(20) DEFAULT NULL COMMENT '道具名称',
  `propNum` int(11) DEFAULT NULL COMMENT '道具数量',
  `propDescription` varchar(50) DEFAULT NULL COMMENT '道具用途描述',
  `landId` varchar(15) DEFAULT NULL COMMENT '游戏信息id，对应land表',
  PRIMARY KEY (`propId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `props` */

/*Table structure for table `windmill` */

DROP TABLE IF EXISTS `windmill`;

CREATE TABLE `windmill` (
  `windmillId` varchar(20) NOT NULL COMMENT '风车id，主键',
  `windCurrent` varchar(10) DEFAULT NULL COMMENT '当前风能',
  `elecCurrent` varchar(10) DEFAULT NULL COMMENT '当前电能',
  `windNeed` varchar(10) DEFAULT NULL COMMENT '建造所需风能',
  `elecNeed` varchar(10) DEFAULT NULL COMMENT '建造所需电能',
  `detail` varchar(50) DEFAULT NULL COMMENT '风车细节描述',
  `createdTime` datetime DEFAULT NULL COMMENT '任务完成时间',
  PRIMARY KEY (`windmillId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `windmill` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
