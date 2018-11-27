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

 Date: 27/11/2018 19:02:59
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
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee_info
-- ----------------------------
INSERT INTO `employee_info` VALUES (10, '000001', '444444', '黄世星', '行长', '1111111', '2018-11-27 00:00:00', '2018-11-27 00:00:00', '2021-11-27 00:00:00', '长兴县', '篮球', 100000000);
INSERT INTO `employee_info` VALUES (11, '000002', '444444', '刘德华1', '行长', '222222', '2018-11-27 00:00:00', '2018-11-27 00:00:00', '2021-11-27 00:00:00', '长兴县', '篮球', 1000000);
INSERT INTO `employee_info` VALUES (13, '000003', '888888', '梁朝伟', '行长', '3333', '2015-11-27 00:00:00', '2015-11-27 00:00:00', '2018-11-27 00:00:00', '长兴县', '花钱', 100000000);
INSERT INTO `employee_info` VALUES (14, '000004', '888888', '刘嘉玲', '行长助理', '2222', '2018-11-26 00:00:00', '2018-11-26 00:00:00', '2021-11-27 00:00:00', '长兴县', '花钱', 10000000);
INSERT INTO `employee_info` VALUES (15, '000005', '333333', '赵丽颖', '行长', '33231', '2018-11-27 00:00:00', '2018-11-27 00:00:00', '2018-12-29 00:00:00', '长兴县', '演戏', 1111111111);
INSERT INTO `employee_info` VALUES (16, '000006', '222222', '张韶涵', '行长', '213321', '2018-11-27 00:00:00', '2018-11-27 00:00:00', '2018-11-27 00:00:00', '长兴县', '演戏', 32312312);
INSERT INTO `employee_info` VALUES (17, '000007', '111111', '张学友', '行长助理', '9090909', '2018-11-27 00:00:00', '2018-11-27 00:00:00', '2019-11-27 00:00:00', '长兴县', '唱歌', 1000000);
INSERT INTO `employee_info` VALUES (19, '0000001', '000000', '马东', '行长', '123123123', '2018-11-27 00:00:00', '2018-11-27 00:00:00', '2018-11-30 00:00:00', '长兴县', '说话', 123123123);

SET FOREIGN_KEY_CHECKS = 1;
