/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : bank

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-11-25 11:11:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee_relatives_info
-- ----------------------------
DROP TABLE IF EXISTS `employee_relatives_info`;
CREATE TABLE `employee_relatives_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `employee_id_card` varchar(20) NOT NULL COMMENT '员工身份证',
  `employee_relatives_id_card` varchar(20) NOT NULL COMMENT '员工亲属ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee_relatives_info
-- ----------------------------
