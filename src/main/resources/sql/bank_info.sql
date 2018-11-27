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

 Date: 27/11/2018 19:02:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bank_info
-- ----------------------------
DROP TABLE IF EXISTS `bank_info`;
CREATE TABLE `bank_info`  (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `bank_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '银行名称',
  `bank_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '机构号',
  `bank_address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '银行地址',
  `bank_longitude` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行经度',
  `bank_latitude` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行纬度',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bank_info
-- ----------------------------
INSERT INTO `bank_info` VALUES (19, '泗安支行', '111111', '长兴县泗安镇', '119.65614', '30.9024');
INSERT INTO `bank_info` VALUES (20, '和平支行', '222222', '长兴县和平镇', '119.89958', '30.8354');
INSERT INTO `bank_info` VALUES (21, '林城支行', '333333', '长兴县林城镇', '119.77794', '30.9385');
INSERT INTO `bank_info` VALUES (22, '小浦支行', '444444', '长兴县小浦镇3', '119.83506', '31.0288');
INSERT INTO `bank_info` VALUES (23, '夹浦支行', '555555', '长兴县夹浦镇', '119.94011', '31.10018');
INSERT INTO `bank_info` VALUES (24, '水口支行', '666666', '长兴县水口乡', '119.8661', '31.1003');
INSERT INTO `bank_info` VALUES (25, '吕山支行', '777777', '长兴县吕山镇', '119.93162', '30.92791');
INSERT INTO `bank_info` VALUES (26, '长兴总行', '888888', '长兴县', '119.90662', '31.02924');
INSERT INTO `bank_info` VALUES (27, '红星桥支行', '999999', '长兴县红星桥镇', '119.90662', '31.02924');
INSERT INTO `bank_info` VALUES (28, '二界岭支行', '000000', '长兴县泗安镇二界岭', '119.64205', '30.98161');

SET FOREIGN_KEY_CHECKS = 1;
