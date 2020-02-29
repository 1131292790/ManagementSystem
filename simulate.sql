/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 5.6.12 : Database - simulate
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`simulate` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `simulate`;

/*Table structure for table `linesta` */

DROP TABLE IF EXISTS `linesta`;

CREATE TABLE `linesta` (
  `lineId` varchar(20) NOT NULL COMMENT '线路id',
  `lineName` varchar(32) NOT NULL COMMENT '线路名称',
  PRIMARY KEY (`lineId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `linesta` */

insert  into `linesta`(`lineId`,`lineName`) values 
('1','一号线'),
('2','二号线');

/*Table structure for table `portrais` */

DROP TABLE IF EXISTS `portrais`;

CREATE TABLE `portrais` (
  `portraisId` varchar(30) NOT NULL,
  `userId` varchar(20) NOT NULL COMMENT '用户id，主键',
  `gender` varchar(2) NOT NULL COMMENT '性别，M/F',
  `nation` varchar(10) NOT NULL COMMENT '国籍，中国/其他',
  `ageInterval` varchar(12) NOT NULL COMMENT '年龄段，0-12',
  `weekAver` varchar(4) NOT NULL COMMENT '周均乘车次数，0-4',
  `monthAver` varchar(6) NOT NULL COMMENT '月均乘车次数，0-6',
  `avgPrice` varchar(6) NOT NULL COMMENT '平均票价，0-6',
  `frequentTvl` varchar(2) NOT NULL COMMENT '是否常旅客，Y/N',
  `regularTvl` varchar(2) NOT NULL COMMENT '是否规律旅客，Y/N',
  `homePlace` varchar(20) NOT NULL COMMENT '居住地站点，站点编号',
  `workPlace` varchar(20) NOT NULL COMMENT '工作地站点，站点编号',
  `oftenPlace` varchar(20) NOT NULL COMMENT '常去站点，站点编号',
  PRIMARY KEY (`portraisId`),
  UNIQUE KEY `userId` (`userId`),
  CONSTRAINT `portrais_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `serveruser` (`userId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `portrais` */

insert  into `portrais`(`portraisId`,`userId`,`gender`,`nation`,`ageInterval`,`weekAver`,`monthAver`,`avgPrice`,`frequentTvl`,`regularTvl`,`homePlace`,`workPlace`,`oftenPlace`) values 
('123456789100','1','M','中国','2','2','2','3','Y','Y','1363613991735313','1363613991735305','1363613991735308'),
('123456789101','2','F','中国','3','3','5','5','Y','Y','1363613991735302 ','1363613991735304 ','1363613991735309 '),
('123456789102','3','M','英国','5','2','4','4','Y','N','1363613991735291 ','1363613991735310 ','1363613991735312 ');

/*Table structure for table `serveruser` */

DROP TABLE IF EXISTS `serveruser`;

CREATE TABLE `serveruser` (
  `userId` varchar(20) NOT NULL COMMENT '主键，用户id',
  `mobilePhone` varchar(15) NOT NULL COMMENT '用户手机号',
  `birthday` datetime NOT NULL COMMENT '用户生日',
  `nickName` varchar(15) NOT NULL COMMENT '用户昵称',
  `cityId` int(5) NOT NULL COMMENT '城市id',
  `cityName` varchar(10) NOT NULL COMMENT '城市名称',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `serveruser` */

insert  into `serveruser`(`userId`,`mobilePhone`,`birthday`,`nickName`,`cityId`,`cityName`) values 
('1','13012345678','1990-01-20 15:20:30','小明',3202,'无锡'),
('2','13547894236','1997-06-25 11:25:02','小王',3202,'无锡'),
('3','13056985412','2000-05-20 06:24:56','小周',3202,'无锡'),
('4','15912364587','1985-06-10 12:58:23','小赵',3202,'无锡');

/*Table structure for table `station` */

DROP TABLE IF EXISTS `station`;

CREATE TABLE `station` (
  `staId` varchar(20) NOT NULL COMMENT '站点id，主键',
  `staName` varchar(20) NOT NULL COMMENT '站点名称',
  `staNo` varchar(20) NOT NULL COMMENT '站点编号',
  `staPhone` varchar(20) DEFAULT NULL COMMENT '站点电话',
  PRIMARY KEY (`staId`),
  KEY `station_no` (`staNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `station` */

insert  into `station`(`staId`,`staName`,`staNo`,`staPhone`) values 
('1363613991735291','堰桥','101','123465789'),
('1363613991735292','锡北运河','102','123456789'),
('1363613991735295','天一','104','123456789'),
('1363613991735300','刘潭','105','132456789'),
('1363613991735301','庄前','106','123456789'),
('1363613991735302','民丰','107','123456789'),
('1363613991735303','无锡火车站','108','123465789'),
('1363613991735304','胜利门','109','123456789'),
('1363613991735305','三阳广场','110','123456789'),
('1363613991735306','南禅寺','111','123456789'),
('1363613991735307','谈渡桥','112','123456789'),
('1363613991735308','太湖广场','113','123456789'),
('1363613991735309','清名桥','114','123456788'),
('1363613991735310','人民医院','115','123465786'),
('1363613991735311','华清大桥','116','123456784'),
('1363613991735312','扬名','117','123456782'),
('1363613991735313','南湖家园','118','123456785');

/*Table structure for table `trip` */

DROP TABLE IF EXISTS `trip`;

CREATE TABLE `trip` (
  `tripId` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userId` varchar(20) DEFAULT NULL COMMENT '乘车人',
  `cityId` int(11) DEFAULT NULL COMMENT '城市id',
  `inStationId` varchar(20) DEFAULT NULL COMMENT '进站站点id',
  `inLineId` varchar(20) DEFAULT NULL COMMENT '线路id（进）',
  `in_time` datetime DEFAULT NULL COMMENT '进站时间',
  `out_station_id` varchar(20) DEFAULT NULL COMMENT '出站站点id',
  `out_line_id` varchar(10) DEFAULT NULL COMMENT '线路id（出）',
  `out_time` datetime DEFAULT NULL COMMENT '出站时间',
  PRIMARY KEY (`tripId`),
  KEY `trip_ibfk_1` (`userId`),
  KEY `inLineId` (`inLineId`),
  KEY `out_station_id` (`out_station_id`),
  KEY `inStationId` (`inStationId`),
  KEY `trip_ibfk_3` (`out_line_id`),
  CONSTRAINT `trip_ibfk_4` FOREIGN KEY (`inStationId`) REFERENCES `station` (`staId`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `trip_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `serveruser` (`userId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `trip_ibfk_2` FOREIGN KEY (`inLineId`) REFERENCES `linesta` (`lineId`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `trip_ibfk_3` FOREIGN KEY (`out_line_id`) REFERENCES `linesta` (`lineId`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `trip_ibfk_5` FOREIGN KEY (`out_station_id`) REFERENCES `station` (`staId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `trip` */

insert  into `trip`(`tripId`,`userId`,`cityId`,`inStationId`,`inLineId`,`in_time`,`out_station_id`,`out_line_id`,`out_time`) values 
(1,'1',3202,'1363613991735313','1','2020-02-29 10:05:02','1363613991735291','1','2020-02-26 10:05:18'),
(4,'2',3202,'1363613991735295','1','2020-02-19 10:07:20','1363613991735303','1','2020-02-29 10:07:30');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
