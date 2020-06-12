/*
 Navicat Premium Data Transfer

 Source Server         : 120.25.252.233
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : 120.25.252.233:3306
 Source Schema         : woke

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 11/06/2020 15:39:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for curriculum
-- ----------------------------
/*课程表*/
DROP TABLE IF EXISTS `curriculum`;
CREATE TABLE `curriculum`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `curriculum_template_id` int(11) NOT NULL COMMENT '课程模板Id',
  `curriculum_template_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程模板名',
  `curriculum_introduce` text CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '课程介绍',
  `Lecturer_Id` int(11) NOT NULL COMMENT '主讲老师Id',
  `Lecturer_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主讲老师',
  `cover_id` int(11) NOT NULL COMMENT '封面Id',
  `other_teacher_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邀请老师',
  `add_label` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标签',
  `is_auditing` bit(1) NOT NULL COMMENT '是否通过审核0：未通过，1通过 ',
  `file_id` int(11) NOT NULL COMMENT '课程文件',
  `is_delete` bit(1) NOT NULL COMMENT '是否删除0代表未删除，1代表删除',
  `create_data_time` datetime(0) NULL DEFAULT NULL,
  `create_user_id` int(11) NULL DEFAULT NULL,
  `update_data_time` datetime(0) NULL DEFAULT NULL,
  `update_user_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for curriculum_courseware
-- ----------------------------
/*课件表*/
DROP TABLE IF EXISTS `curriculum_courseware`;
CREATE TABLE `curriculum_courseware`  (
  `id` int(11) NOT NULL,
  `curriculum_id` int(11) NULL DEFAULT NULL COMMENT '课程id',
  `level` tinyint(4) NULL DEFAULT NULL COMMENT '深度',
  `chapter_tiltle` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '章标题',
  `section_tiltle` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '节标题',
  `small_section` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '小节标题',
  `is_auditing` bit(1) NULL DEFAULT NULL COMMENT '是否通过审核0：未通过，1通过',
  `Lecturer_Id` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '主讲老师',
  `create_data_time` datetime(0) NULL DEFAULT NULL,
  `create_user_id` int(11) NULL DEFAULT NULL,
  `update_data_time` datetime(0) NULL DEFAULT NULL,
  `update_user_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for curriculum_level
-- ----------------------------
/*课程模板中课程层级*/
DROP TABLE IF EXISTS `curriculum_level`;
CREATE TABLE `curriculum_level`  (
  `id` int(11) NOT NULL,
  `curriculum_template_product_id` int(11) NOT NULL,
  `level` tinyint(4) NOT NULL COMMENT '深度',
  `chapter` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '章标题',
  `section` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '节标题',
  `small` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '小节标题',
  `create_data_time` datetime(0) NULL DEFAULT NULL,
  `create_user_id` int(11) NULL DEFAULT NULL,
  `update_data_time` datetime(0) NULL DEFAULT NULL,
  `update_user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of curriculum_level
-- ----------------------------
INSERT INTO `curriculum_level` VALUES (1, 0, 1, '1', '1', '1', '2020-06-10 19:32:41', 1, '2020-06-10 19:32:24', 1);

-- ----------------------------
-- Table structure for curriculum_template
-- ----------------------------
DROP TABLE IF EXISTS `curriculum_template`;
/*模板表*/
CREATE TABLE `curriculum_template`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程id',
  `template_name` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程模板名称',
  `subject` int(11) NOT NULL COMMENT '科目',
  `teacher_id` int(11) NOT NULL COMMENT '教师id',
  `difficulty` tinyint(4) NOT NULL COMMENT '1-5 代表难度',
  `semester` tinyint(4) NOT NULL COMMENT '1 代表上学期 2代表下学期 3代表上下两学期',
  `teacher_numbers` tinyint(1) NOT NULL COMMENT '1 代表3人以内 2 代表五人以内 3 代表10人以内 ',
  `apply_grade` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '适用年级',
  `cover_id` int(11) NOT NULL COMMENT '封面id',
  `min_student_numbers` int(4) NOT NULL COMMENT '最少学生数量',
  `max_student_numbers` int(4) NOT NULL COMMENT '最多学生数量',
  `product_form_id` int(10) NULL DEFAULT NULL COMMENT '产品形式Id//舍弃',
  `class_start_date` datetime(0) NULL DEFAULT NULL COMMENT '课程上课日期',
  `template_plant_numbers` int(11) NOT NULL COMMENT '模板使用次数',
  `total_class` int(11) NOT NULL COMMENT '总课时数（节数）',
  `total_class_hours` int(11) NOT NULL COMMENT '课程有效时长',
  `is_stop` bit(1) NULL DEFAULT NULL COMMENT '是否停止',
  `is_delete` bit(1) NULL DEFAULT NULL COMMENT '是否删除 默认为0：1代表删除',
  `create_data_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `create_user_id` int(11) NULL DEFAULT NULL COMMENT '创建人_id',
  `update_data_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `update_user_id` int(11) NULL DEFAULT NULL COMMENT '更新人_id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of curriculum_template
-- ----------------------------
INSERT INTO `curriculum_template` VALUES (1, '模板名称', 1, 1, 3, 3, 1, '适用1-3年纪', 100, 25, 99, 333, NULL, 100, 100, 100, NULL, b'1', NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (2, '更新的', 2, 1, 3, 3, 1, '适用1-3年纪', 100, 25, 99, 333, NULL, 100, 100, 100, NULL, NULL, NULL, NULL, '2020-06-10 18:01:02', NULL);
INSERT INTO `curriculum_template` VALUES (3, '模板名称', 3, 1, 3, 3, 1, '适用1-3年纪', 100, 25, 99, 333, NULL, 100, 100, 100, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (4, '模板名称', 3, 1, 3, 3, 1, '适用1-3年纪', 100, 25, 99, 333, NULL, 100, 100, 100, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (5, '模板名称', 2, 1, 3, 3, 1, '适用1-3年纪', 100, 25, 99, 333, NULL, 100, 100, 100, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (6, '模板名称', 1, 1, 3, 3, 1, '适用1-3年纪', 100, 25, 99, 333, NULL, 100, 100, 100, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (7, '模板名称', 1, 1, 3, 3, 1, '适用1-3年纪', 100, 25, 99, 333, NULL, 100, 100, 100, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (8, '模板名称', 1, 1, 3, 3, 1, '适用1-3年纪', 100, 25, 99, 333, NULL, 100, 100, 100, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (9, '课程模板二', 12, 1, 1, 1, 3, '一年级,三年级', 1, 25, 99, NULL, NULL, 1000, 6, 123, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (10, '课程模板二', 12, 1, 1, 1, 3, '一年级,三年级', 1, 25, 99, NULL, NULL, 1000, 6, 123, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (11, '课程模板二', 12, 1, 1, 1, 3, '一年级,三年级', 1, 25, 99, NULL, NULL, 1000, 6, 123, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (12, '课程模板二', 12, 1, 1, 1, 3, '一年级,三年级', 1, 25, 99, NULL, NULL, 1000, 6, 123, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (13, '课程模板二', 12, 1, 1, 1, 3, '一年级,三年级', 1, 25, 99, NULL, NULL, 1000, 6, 123, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (14, '课程模板二', 12, 1, 1, 1, 3, '一年级,三年级', 1, 25, 99, NULL, NULL, 1000, 6, 123, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (15, '课程模板二', 12, 1, 1, 1, 3, '一年级,三年级', 1, 25, 99, NULL, NULL, 1000, 6, 123, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (16, '课程模板二', 12, 1, 1, 1, 3, '一年级,三年级', 1, 25, 99, NULL, NULL, 1000, 6, 123, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (17, '课程模板二', 12, 1, 1, 1, 3, '一年级,三年级', 1, 25, 99, NULL, NULL, 1000, 6, 123, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (18, '课程模板二', 12, 1, 1, 1, 3, '一年级,三年级', 1, 25, 99, NULL, NULL, 1000, 6, 123, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template` VALUES (19, '课程模板二', 12, 1, 1, 1, 3, '一年级,三年级', 1, 25, 99, NULL, NULL, 1000, 6, 123, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for curriculum_template_product
-- ----------------------------
/*课程模板的产品表（四种课程形式）*/
DROP TABLE IF EXISTS `curriculum_template_product`;
CREATE TABLE `curriculum_template_product`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `curriculum_template_id` int(11) NOT NULL COMMENT '课程模板Id',
  `class_plan_id` int(11) NOT NULL COMMENT '上课安排',
  `type` tinyint(4) NULL DEFAULT NULL COMMENT '1 代表专题课程 2 代表直播课程 3代表精品课程 4代表作业指导',
  `teacher_assistant` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教辅',
  `level` tinyint(4) NOT NULL COMMENT '课程级别',
  `total_chapter` tinyint(4) NOT NULL COMMENT '章节总数',
  `curriculum_level_id` int(11) NOT NULL COMMENT '课程级别id',
  `purchase_validity_data` datetime(0) NULL DEFAULT NULL COMMENT '购买剩余时间',
  `enable_try_look` bit(1) NULL DEFAULT NULL COMMENT '1 代表试看，0代表不能试看',
  `service_cycle` int(1) NULL DEFAULT NULL COMMENT '1月卡，2代表季卡，3年卡 ',
  `equipment_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备名称',
  `plan_class` json NULL COMMENT '上课安排',
  `is_delete` bit(1) NULL DEFAULT NULL COMMENT '是否删除0代表未删除，1代表删除',
  `create_data_time` datetime(0) NULL DEFAULT NULL,
  `create_user_id` int(11) NULL DEFAULT NULL,
  `update_data_time` datetime(0) NULL DEFAULT NULL,
  `update_user_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of curriculum_template_product
-- ----------------------------
INSERT INTO `curriculum_template_product` VALUES (1, 2, 2, 1, '小王通知', 3, 3, 1, '2020-06-11 08:00:00', b'0', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template_product` VALUES (2, 2, 2, 1, '更新的', 3, 3, 1, '2020-06-11 08:00:00', b'0', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template_product` VALUES (3, 2, 2, 1, '小王通知', 3, 3, 2, '2020-06-11 08:00:00', b'0', 1, NULL, NULL, b'1', NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template_product` VALUES (4, 1, 1, 1, '1', 1, 1, 1, NULL, b'0', 1, '精品课程', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template_product` VALUES (5, 1, 1, 1, '1', 1, 1, 1, NULL, b'0', 1, '精品课程', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template_product` VALUES (6, 1, 1, 1, '1', 1, 1, 1, NULL, b'0', 1, '精品课程', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template_product` VALUES (7, 1, 1, 1, '1', 1, 1, 1, NULL, b'0', 1, '精品课程', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template_product` VALUES (8, 1, 1, 1, '1', 1, 1, 1, NULL, b'0', 1, '精品课程', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template_product` VALUES (9, 1, 1, 1, '1', 1, 1, 1, NULL, b'0', 1, '精品课程', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template_product` VALUES (10, 1, 1, 1, '小王老师', 1, 3, 1, NULL, b'0', 1, '蓝牙智能笔', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template_product` VALUES (11, 18, 1, 1, '小王老师', 1, 3, 1, NULL, b'0', 1, '蓝牙智能笔', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `curriculum_template_product` VALUES (12, 19, 1, 1, '小王老师', 1, 3, 1, NULL, b'0', 1, '蓝牙智能笔', NULL, NULL, NULL, NULL, NULL, NULL);

