/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.1.61-community : Database - dam_management
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dam_management` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `dam_management`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `aname` varchar(200) DEFAULT NULL,
  `apass` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

insert  into `admin`(`aid`,`aname`,`apass`) values (1,'admin','admin');

/*Table structure for table `affected_city` */

DROP TABLE IF EXISTS `affected_city`;

CREATE TABLE `affected_city` (
  `acid` int(11) NOT NULL AUTO_INCREMENT,
  `cid` varchar(200) DEFAULT NULL,
  `did` int(11) DEFAULT NULL,
  `active` int(11) DEFAULT '0',
  PRIMARY KEY (`acid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `affected_city` */

insert  into `affected_city`(`acid`,`cid`,`did`,`active`) values (1,'2,3',1,0);

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `state` varchar(200) DEFAULT NULL,
  `city_name` varchar(200) DEFAULT NULL,
  `active` int(11) DEFAULT '0',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `city` */

insert  into `city`(`cid`,`state`,`city_name`,`active`) values (2,'1','Mysore',0),(3,'1','Shrirangapattana',0);

/*Table structure for table `dam` */

DROP TABLE IF EXISTS `dam`;

CREATE TABLE `dam` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(200) DEFAULT NULL,
  `place` varchar(200) DEFAULT NULL,
  `uid` varchar(200) DEFAULT NULL,
  `d_height` varchar(200) DEFAULT NULL,
  `d_lenght` varchar(200) DEFAULT NULL,
  `c_date` varchar(200) DEFAULT NULL,
  `active` int(11) DEFAULT '0',
  `state` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `dam` */

insert  into `dam`(`did`,`dname`,`place`,`uid`,`d_height`,`d_lenght`,`c_date`,`active`,`state`) values (1,'KRS','2','1','40 M','2.620 M','1934-01-01',0,'1');

/*Table structure for table `range` */

DROP TABLE IF EXISTS `range`;

CREATE TABLE `range` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `maxinflow` varchar(200) DEFAULT NULL,
  `maxoutflow` varchar(200) DEFAULT NULL,
  `did` int(11) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `range` */

insert  into `range`(`rid`,`maxinflow`,`maxoutflow`,`did`) values (1,'128 ft','250 ft',1);

/*Table structure for table `state` */

DROP TABLE IF EXISTS `state`;

CREATE TABLE `state` (
  `state_id` int(11) NOT NULL AUTO_INCREMENT,
  `state` varchar(200) DEFAULT NULL,
  `active` int(11) DEFAULT '0',
  PRIMARY KEY (`state_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `state` */

insert  into `state`(`state_id`,`state`,`active`) values (1,'Karnataka',0),(2,'Tamilunadu',0);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(200) DEFAULT NULL,
  `umail` varchar(200) DEFAULT NULL,
  `uadd` varchar(200) DEFAULT NULL,
  `upho` varchar(200) DEFAULT NULL,
  `upass` varchar(200) DEFAULT NULL,
  `active` int(11) DEFAULT '0',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`uid`,`uname`,`umail`,`uadd`,`upho`,`upass`,`active`) values (1,'Jafar','jafaraftab15011@gmail.com','Mysore','9591769165','1234',0);

/*Table structure for table `water_level` */

DROP TABLE IF EXISTS `water_level`;

CREATE TABLE `water_level` (
  `wid` int(11) NOT NULL AUTO_INCREMENT,
  `did` varchar(200) DEFAULT NULL,
  `date` varchar(200) DEFAULT NULL,
  `inflow` varchar(200) DEFAULT NULL,
  `outflow` varchar(200) DEFAULT NULL,
  `active` int(11) DEFAULT '0',
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `water_level` */

insert  into `water_level`(`wid`,`did`,`date`,`inflow`,`outflow`,`active`) values (1,'1','2019-11-11 18:31:07','180 ft','220 ft',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
