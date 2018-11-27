/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : bank

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 27/11/2018 08:34:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employee_info
-- ----------------------------
DROP TABLE IF EXISTS `employee_info`;
CREATE TABLE `employee_info`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `employee_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '柜员号',
  `employee_bankId` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '机构号',
  `employee_name` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '柜员名称',
  `employee_role` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '职务（A：行长，B:行长助理，C:客户经理，D:会计主管，E:会计助理，F：综合柜员，G:大堂经理）',
  `employee_identity` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '身份证',
  `employee_workDate` datetime(0) NOT NULL COMMENT '开始工作时间',
  `employee_inDate` datetime(0) NOT NULL COMMENT '调入时间',
  `employee_outDate` datetime(0) NOT NULL COMMENT '最后工作期限',
  `employee_address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `employee_speciality` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '特长',
  `employee_inCome` bigint(11) NULL DEFAULT NULL COMMENT '员工年收入',
  PRIMARY KEY (`id`, `employee_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee_info
-- ----------------------------
INSERT INTO `employee_info` VALUES (1, '23', '12345678', '231', '行长', '123', '2018-11-27 00:00:00', '2018-11-28 00:00:00', '2018-11-08 00:00:00', '132', NULL, 321);
INSERT INTO `employee_info` VALUES (2, '大神', '12345678', '谁打', '行长助理', '阿诗丹顿', '2018-11-20 00:00:00', '2018-11-28 00:00:00', '2018-11-20 00:00:00', '12123', NULL, 123231);
INSERT INTO `employee_info` VALUES (3, '123', '12345678', '123', '行长', '123', '2018-11-20 00:00:00', '2018-11-21 00:00:00', '2018-11-29 00:00:00', '312', NULL, 123);
INSERT INTO `employee_info` VALUES (4, '213', '12345678', '23', '行长', '213', '2018-11-27 00:00:00', '2018-11-28 00:00:00', '2018-11-14 00:00:00', '123', '123', 213);
INSERT INTO `employee_info` VALUES (5, '32312', '12345678', '323232', '行长', '3123', '2018-11-21 00:00:00', '2018-11-14 00:00:00', '2018-11-20 00:00:00', '23', '23', 123);
INSERT INTO `employee_info` VALUES (6, '123', '12345678', '213', '行长', '312', '2018-11-26 00:00:00', '2018-11-21 00:00:00', '2018-11-28 00:00:00', '123', '312', 123);
INSERT INTO `employee_info` VALUES (7, '123', '12345678', '213', '行长', '312', '2018-11-21 00:00:00', '2018-11-28 00:00:00', '2018-11-22 00:00:00', '123', '123', 123);
INSERT INTO `employee_info` VALUES (8, '23', '12345678', '123', '行长助理', '32', '2018-11-27 00:00:00', '2018-11-19 00:00:00', '2018-11-26 00:00:00', '32', '123', 123);

SET FOREIGN_KEY_CHECKS = 1;
