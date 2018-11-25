/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : bank

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-11-25 11:11:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bank_info
-- ----------------------------
DROP TABLE IF EXISTS `bank_info`;
CREATE TABLE `bank_info` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `bank_name` varchar(50) NOT NULL COMMENT '银行名称',
  `bank_id` varchar(11) NOT NULL COMMENT '机构号',
  `bank_address` varchar(100) NOT NULL COMMENT '银行地址',
  `bank_longitude` varchar(20) DEFAULT NULL COMMENT '银行经度',
  `bank_latitude` varchar(20) DEFAULT NULL COMMENT '银行纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bank_info
-- ----------------------------
INSERT INTO `bank_info` VALUES ('5', '和平支行', '9090902', '长兴县和平镇', null, null);
INSERT INTO `bank_info` VALUES ('6', '金钉子支行', '123456', '长兴县金钉子远古世界景区', null, null);
INSERT INTO `bank_info` VALUES ('7', '泗安支行', '123456', '长兴县泗安镇天星广场', null, null);
INSERT INTO `bank_info` VALUES ('8', '水口支行', '1312321', '长兴县水口乡', null, null);
INSERT INTO `bank_info` VALUES ('9', '金陵支行', '12312321', '长兴县金陵高级中学', null, null);
INSERT INTO `bank_info` VALUES ('10', '委屈二', '2312312', '长兴县和平镇', null, null);
INSERT INTO `bank_info` VALUES ('11', '阿达的', '23123', '长兴县林城镇', null, null);
INSERT INTO `bank_info` VALUES ('12', '独山大道', '123123', '长兴县小浦镇', null, null);
INSERT INTO `bank_info` VALUES ('13', '32123', '胃切除', '长兴县二界岭乡', null, null);
INSERT INTO `bank_info` VALUES ('14', '在', '12312 ', '长兴县吕山乡', null, null);
INSERT INTO `bank_info` VALUES ('15', '卫栖梧', '232131', '长兴县红星桥镇', '119.90662', '31.02924');
INSERT INTO `bank_info` VALUES ('16', '卫栖梧', '23123', '长兴县吴山乡', '119.82582', '30.8429');
INSERT INTO `bank_info` VALUES ('17', '213', '恶趣味', '长兴县八三机场', '119.90662', '31.02924');
