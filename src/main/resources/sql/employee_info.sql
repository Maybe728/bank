/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : bank

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-11-25 11:11:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee_info
-- ----------------------------
DROP TABLE IF EXISTS `employee_info`;
CREATE TABLE `employee_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `employee_id` varchar(11) NOT NULL COMMENT '柜员号',
  `bank_id` varchar(20) NOT NULL DEFAULT '' COMMENT '机构号',
  `employee_name` varchar(11) NOT NULL COMMENT '柜员名称',
  `employee_duties` varchar(11) NOT NULL DEFAULT '' COMMENT '职务（A：行长，B:行长助理，C:客户经理，D:会计主管，E:会计助理，F：综合柜员，G:大堂经理）',
  `employee_id_card` varchar(50) NOT NULL COMMENT '身份证',
  `employee_work_date` datetime NOT NULL COMMENT '开始工作时间',
  `employee_move_date` datetime NOT NULL COMMENT '调入时间',
  `employee_work_deadlines` datetime NOT NULL COMMENT '最后工作期限',
  `employee_address` varchar(100) NOT NULL,
  `employee_speciality` text COMMENT '特长',
  `employee_income` bigint(11) DEFAULT NULL COMMENT '员工年收入',
  PRIMARY KEY (`id`,`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee_info
-- ----------------------------
