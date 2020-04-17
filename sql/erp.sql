/*
Navicat MySQL Data Transfer

Source Server         : ALiYun
Source Server Version : 80019
Source Host           : 39.106.71.75:3306
Source Database       : erp

Target Server Type    : MYSQL
Target Server Version : 80019
File Encoding         : 65001

Date: 2020-04-17 17:49:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ACT_EVT_LOG
-- ----------------------------
DROP TABLE IF EXISTS `ACT_EVT_LOG`;
CREATE TABLE `ACT_EVT_LOG` (
  `LOG_NR_` bigint NOT NULL AUTO_INCREMENT,
  `TYPE_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROC_DEF_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `EXECUTION_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `TASK_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `TIME_STAMP_` timestamp(3) NOT NULL,
  `USER_ID_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `DATA_` longblob,
  `LOCK_OWNER_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `LOCK_TIME_` timestamp(3) NULL DEFAULT NULL,
  `IS_PROCESSED_` tinyint DEFAULT '0',
  PRIMARY KEY (`LOG_NR_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_EVT_LOG
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_GE_BYTEARRAY
-- ----------------------------
DROP TABLE IF EXISTS `ACT_GE_BYTEARRAY`;
CREATE TABLE `ACT_GE_BYTEARRAY` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `DEPLOYMENT_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `BYTES_` longblob,
  `GENERATED_` tinyint DEFAULT NULL,
  PRIMARY KEY (`ID_`),
  KEY `ACT_FK_BYTEARR_DEPL` (`DEPLOYMENT_ID_`),
  CONSTRAINT `ACT_FK_BYTEARR_DEPL` FOREIGN KEY (`DEPLOYMENT_ID_`) REFERENCES `ACT_RE_DEPLOYMENT` (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_GE_BYTEARRAY
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_GE_PROPERTY
-- ----------------------------
DROP TABLE IF EXISTS `ACT_GE_PROPERTY`;
CREATE TABLE `ACT_GE_PROPERTY` (
  `NAME_` varchar(64) COLLATE utf8_bin NOT NULL,
  `VALUE_` varchar(300) COLLATE utf8_bin DEFAULT NULL,
  `REV_` int DEFAULT NULL,
  PRIMARY KEY (`NAME_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_GE_PROPERTY
-- ----------------------------
INSERT INTO `ACT_GE_PROPERTY` VALUES ('next.dbid', '1', '1');
INSERT INTO `ACT_GE_PROPERTY` VALUES ('schema.history', 'create(5.22.0.0)', '1');
INSERT INTO `ACT_GE_PROPERTY` VALUES ('schema.version', '5.22.0.0', '1');

-- ----------------------------
-- Table structure for ACT_HI_ACTINST
-- ----------------------------
DROP TABLE IF EXISTS `ACT_HI_ACTINST`;
CREATE TABLE `ACT_HI_ACTINST` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `PROC_DEF_ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `EXECUTION_ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `ACT_ID_` varchar(255) COLLATE utf8_bin NOT NULL,
  `TASK_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `CALL_PROC_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `ACT_NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `ACT_TYPE_` varchar(255) COLLATE utf8_bin NOT NULL,
  `ASSIGNEE_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `START_TIME_` datetime(3) NOT NULL,
  `END_TIME_` datetime(3) DEFAULT NULL,
  `DURATION_` bigint DEFAULT NULL,
  `TENANT_ID_` varchar(255) COLLATE utf8_bin DEFAULT '',
  PRIMARY KEY (`ID_`),
  KEY `ACT_IDX_HI_ACT_INST_START` (`START_TIME_`),
  KEY `ACT_IDX_HI_ACT_INST_END` (`END_TIME_`),
  KEY `ACT_IDX_HI_ACT_INST_PROCINST` (`PROC_INST_ID_`,`ACT_ID_`),
  KEY `ACT_IDX_HI_ACT_INST_EXEC` (`EXECUTION_ID_`,`ACT_ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_HI_ACTINST
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_HI_ATTACHMENT
-- ----------------------------
DROP TABLE IF EXISTS `ACT_HI_ATTACHMENT`;
CREATE TABLE `ACT_HI_ATTACHMENT` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `USER_ID_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `DESCRIPTION_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `TYPE_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TASK_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `URL_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `CONTENT_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `TIME_` datetime(3) DEFAULT NULL,
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_HI_ATTACHMENT
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_HI_COMMENT
-- ----------------------------
DROP TABLE IF EXISTS `ACT_HI_COMMENT`;
CREATE TABLE `ACT_HI_COMMENT` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `TYPE_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TIME_` datetime(3) NOT NULL,
  `USER_ID_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TASK_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `ACTION_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `MESSAGE_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `FULL_MSG_` longblob,
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_HI_COMMENT
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_HI_DETAIL
-- ----------------------------
DROP TABLE IF EXISTS `ACT_HI_DETAIL`;
CREATE TABLE `ACT_HI_DETAIL` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `TYPE_` varchar(255) COLLATE utf8_bin NOT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `EXECUTION_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `TASK_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `ACT_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `NAME_` varchar(255) COLLATE utf8_bin NOT NULL,
  `VAR_TYPE_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `REV_` int DEFAULT NULL,
  `TIME_` datetime(3) NOT NULL,
  `BYTEARRAY_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `DOUBLE_` double DEFAULT NULL,
  `LONG_` bigint DEFAULT NULL,
  `TEXT_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `TEXT2_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID_`),
  KEY `ACT_IDX_HI_DETAIL_PROC_INST` (`PROC_INST_ID_`),
  KEY `ACT_IDX_HI_DETAIL_ACT_INST` (`ACT_INST_ID_`),
  KEY `ACT_IDX_HI_DETAIL_TIME` (`TIME_`),
  KEY `ACT_IDX_HI_DETAIL_NAME` (`NAME_`),
  KEY `ACT_IDX_HI_DETAIL_TASK_ID` (`TASK_ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_HI_DETAIL
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_HI_IDENTITYLINK
-- ----------------------------
DROP TABLE IF EXISTS `ACT_HI_IDENTITYLINK`;
CREATE TABLE `ACT_HI_IDENTITYLINK` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `GROUP_ID_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TYPE_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `USER_ID_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TASK_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID_`),
  KEY `ACT_IDX_HI_IDENT_LNK_USER` (`USER_ID_`),
  KEY `ACT_IDX_HI_IDENT_LNK_TASK` (`TASK_ID_`),
  KEY `ACT_IDX_HI_IDENT_LNK_PROCINST` (`PROC_INST_ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_HI_IDENTITYLINK
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_HI_PROCINST
-- ----------------------------
DROP TABLE IF EXISTS `ACT_HI_PROCINST`;
CREATE TABLE `ACT_HI_PROCINST` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `BUSINESS_KEY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `PROC_DEF_ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `START_TIME_` datetime(3) NOT NULL,
  `END_TIME_` datetime(3) DEFAULT NULL,
  `DURATION_` bigint DEFAULT NULL,
  `START_USER_ID_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `START_ACT_ID_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `END_ACT_ID_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `SUPER_PROCESS_INSTANCE_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `DELETE_REASON_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `TENANT_ID_` varchar(255) COLLATE utf8_bin DEFAULT '',
  `NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID_`),
  UNIQUE KEY `PROC_INST_ID_` (`PROC_INST_ID_`),
  KEY `ACT_IDX_HI_PRO_INST_END` (`END_TIME_`),
  KEY `ACT_IDX_HI_PRO_I_BUSKEY` (`BUSINESS_KEY_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_HI_PROCINST
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_HI_TASKINST
-- ----------------------------
DROP TABLE IF EXISTS `ACT_HI_TASKINST`;
CREATE TABLE `ACT_HI_TASKINST` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `PROC_DEF_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `TASK_DEF_KEY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `EXECUTION_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `PARENT_TASK_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `DESCRIPTION_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `OWNER_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `ASSIGNEE_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `START_TIME_` datetime(3) NOT NULL,
  `CLAIM_TIME_` datetime(3) DEFAULT NULL,
  `END_TIME_` datetime(3) DEFAULT NULL,
  `DURATION_` bigint DEFAULT NULL,
  `DELETE_REASON_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `PRIORITY_` int DEFAULT NULL,
  `DUE_DATE_` datetime(3) DEFAULT NULL,
  `FORM_KEY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CATEGORY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TENANT_ID_` varchar(255) COLLATE utf8_bin DEFAULT '',
  PRIMARY KEY (`ID_`),
  KEY `ACT_IDX_HI_TASK_INST_PROCINST` (`PROC_INST_ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_HI_TASKINST
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_HI_VARINST
-- ----------------------------
DROP TABLE IF EXISTS `ACT_HI_VARINST`;
CREATE TABLE `ACT_HI_VARINST` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `EXECUTION_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `TASK_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `NAME_` varchar(255) COLLATE utf8_bin NOT NULL,
  `VAR_TYPE_` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `REV_` int DEFAULT NULL,
  `BYTEARRAY_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `DOUBLE_` double DEFAULT NULL,
  `LONG_` bigint DEFAULT NULL,
  `TEXT_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `TEXT2_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `CREATE_TIME_` datetime(3) DEFAULT NULL,
  `LAST_UPDATED_TIME_` datetime(3) DEFAULT NULL,
  PRIMARY KEY (`ID_`),
  KEY `ACT_IDX_HI_PROCVAR_PROC_INST` (`PROC_INST_ID_`),
  KEY `ACT_IDX_HI_PROCVAR_NAME_TYPE` (`NAME_`,`VAR_TYPE_`),
  KEY `ACT_IDX_HI_PROCVAR_TASK_ID` (`TASK_ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_HI_VARINST
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_ID_GROUP
-- ----------------------------
DROP TABLE IF EXISTS `ACT_ID_GROUP`;
CREATE TABLE `ACT_ID_GROUP` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TYPE_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_ID_GROUP
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_ID_INFO
-- ----------------------------
DROP TABLE IF EXISTS `ACT_ID_INFO`;
CREATE TABLE `ACT_ID_INFO` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `USER_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `TYPE_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `KEY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `VALUE_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `PASSWORD_` longblob,
  `PARENT_ID_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_ID_INFO
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_ID_MEMBERSHIP
-- ----------------------------
DROP TABLE IF EXISTS `ACT_ID_MEMBERSHIP`;
CREATE TABLE `ACT_ID_MEMBERSHIP` (
  `USER_ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `GROUP_ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`USER_ID_`,`GROUP_ID_`),
  KEY `ACT_FK_MEMB_GROUP` (`GROUP_ID_`),
  CONSTRAINT `ACT_FK_MEMB_GROUP` FOREIGN KEY (`GROUP_ID_`) REFERENCES `ACT_ID_GROUP` (`ID_`),
  CONSTRAINT `ACT_FK_MEMB_USER` FOREIGN KEY (`USER_ID_`) REFERENCES `ACT_ID_USER` (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_ID_MEMBERSHIP
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_ID_USER
-- ----------------------------
DROP TABLE IF EXISTS `ACT_ID_USER`;
CREATE TABLE `ACT_ID_USER` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `FIRST_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `LAST_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `EMAIL_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `PWD_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `PICTURE_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_ID_USER
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_PROCDEF_INFO
-- ----------------------------
DROP TABLE IF EXISTS `ACT_PROCDEF_INFO`;
CREATE TABLE `ACT_PROCDEF_INFO` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `PROC_DEF_ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `INFO_JSON_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID_`),
  UNIQUE KEY `ACT_UNIQ_INFO_PROCDEF` (`PROC_DEF_ID_`),
  KEY `ACT_IDX_INFO_PROCDEF` (`PROC_DEF_ID_`),
  KEY `ACT_FK_INFO_JSON_BA` (`INFO_JSON_ID_`),
  CONSTRAINT `ACT_FK_INFO_JSON_BA` FOREIGN KEY (`INFO_JSON_ID_`) REFERENCES `ACT_GE_BYTEARRAY` (`ID_`),
  CONSTRAINT `ACT_FK_INFO_PROCDEF` FOREIGN KEY (`PROC_DEF_ID_`) REFERENCES `ACT_RE_PROCDEF` (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_PROCDEF_INFO
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_RE_DEPLOYMENT
-- ----------------------------
DROP TABLE IF EXISTS `ACT_RE_DEPLOYMENT`;
CREATE TABLE `ACT_RE_DEPLOYMENT` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CATEGORY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TENANT_ID_` varchar(255) COLLATE utf8_bin DEFAULT '',
  `DEPLOY_TIME_` timestamp(3) NULL DEFAULT NULL,
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_RE_DEPLOYMENT
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_RE_MODEL
-- ----------------------------
DROP TABLE IF EXISTS `ACT_RE_MODEL`;
CREATE TABLE `ACT_RE_MODEL` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `KEY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CATEGORY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CREATE_TIME_` timestamp(3) NULL DEFAULT NULL,
  `LAST_UPDATE_TIME_` timestamp(3) NULL DEFAULT NULL,
  `VERSION_` int DEFAULT NULL,
  `META_INFO_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `DEPLOYMENT_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `EDITOR_SOURCE_VALUE_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `EDITOR_SOURCE_EXTRA_VALUE_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `TENANT_ID_` varchar(255) COLLATE utf8_bin DEFAULT '',
  PRIMARY KEY (`ID_`),
  KEY `ACT_FK_MODEL_SOURCE` (`EDITOR_SOURCE_VALUE_ID_`),
  KEY `ACT_FK_MODEL_SOURCE_EXTRA` (`EDITOR_SOURCE_EXTRA_VALUE_ID_`),
  KEY `ACT_FK_MODEL_DEPLOYMENT` (`DEPLOYMENT_ID_`),
  CONSTRAINT `ACT_FK_MODEL_DEPLOYMENT` FOREIGN KEY (`DEPLOYMENT_ID_`) REFERENCES `ACT_RE_DEPLOYMENT` (`ID_`),
  CONSTRAINT `ACT_FK_MODEL_SOURCE` FOREIGN KEY (`EDITOR_SOURCE_VALUE_ID_`) REFERENCES `ACT_GE_BYTEARRAY` (`ID_`),
  CONSTRAINT `ACT_FK_MODEL_SOURCE_EXTRA` FOREIGN KEY (`EDITOR_SOURCE_EXTRA_VALUE_ID_`) REFERENCES `ACT_GE_BYTEARRAY` (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_RE_MODEL
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_RE_PROCDEF
-- ----------------------------
DROP TABLE IF EXISTS `ACT_RE_PROCDEF`;
CREATE TABLE `ACT_RE_PROCDEF` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `CATEGORY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `KEY_` varchar(255) COLLATE utf8_bin NOT NULL,
  `VERSION_` int NOT NULL,
  `DEPLOYMENT_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `RESOURCE_NAME_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `DGRM_RESOURCE_NAME_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `DESCRIPTION_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `HAS_START_FORM_KEY_` tinyint DEFAULT NULL,
  `HAS_GRAPHICAL_NOTATION_` tinyint DEFAULT NULL,
  `SUSPENSION_STATE_` int DEFAULT NULL,
  `TENANT_ID_` varchar(255) COLLATE utf8_bin DEFAULT '',
  PRIMARY KEY (`ID_`),
  UNIQUE KEY `ACT_UNIQ_PROCDEF` (`KEY_`,`VERSION_`,`TENANT_ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_RE_PROCDEF
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_RU_EVENT_SUBSCR
-- ----------------------------
DROP TABLE IF EXISTS `ACT_RU_EVENT_SUBSCR`;
CREATE TABLE `ACT_RU_EVENT_SUBSCR` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `EVENT_TYPE_` varchar(255) COLLATE utf8_bin NOT NULL,
  `EVENT_NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `EXECUTION_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `ACTIVITY_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `CONFIGURATION_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CREATED_` timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3),
  `PROC_DEF_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `TENANT_ID_` varchar(255) COLLATE utf8_bin DEFAULT '',
  PRIMARY KEY (`ID_`),
  KEY `ACT_IDX_EVENT_SUBSCR_CONFIG_` (`CONFIGURATION_`),
  KEY `ACT_FK_EVENT_EXEC` (`EXECUTION_ID_`),
  CONSTRAINT `ACT_FK_EVENT_EXEC` FOREIGN KEY (`EXECUTION_ID_`) REFERENCES `ACT_RU_EXECUTION` (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_RU_EVENT_SUBSCR
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_RU_EXECUTION
-- ----------------------------
DROP TABLE IF EXISTS `ACT_RU_EXECUTION`;
CREATE TABLE `ACT_RU_EXECUTION` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `BUSINESS_KEY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `PARENT_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROC_DEF_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `SUPER_EXEC_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `ACT_ID_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `IS_ACTIVE_` tinyint DEFAULT NULL,
  `IS_CONCURRENT_` tinyint DEFAULT NULL,
  `IS_SCOPE_` tinyint DEFAULT NULL,
  `IS_EVENT_SCOPE_` tinyint DEFAULT NULL,
  `SUSPENSION_STATE_` int DEFAULT NULL,
  `CACHED_ENT_STATE_` int DEFAULT NULL,
  `TENANT_ID_` varchar(255) COLLATE utf8_bin DEFAULT '',
  `NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `LOCK_TIME_` timestamp(3) NULL DEFAULT NULL,
  PRIMARY KEY (`ID_`),
  KEY `ACT_IDX_EXEC_BUSKEY` (`BUSINESS_KEY_`),
  KEY `ACT_FK_EXE_PROCINST` (`PROC_INST_ID_`),
  KEY `ACT_FK_EXE_PARENT` (`PARENT_ID_`),
  KEY `ACT_FK_EXE_SUPER` (`SUPER_EXEC_`),
  KEY `ACT_FK_EXE_PROCDEF` (`PROC_DEF_ID_`),
  CONSTRAINT `ACT_FK_EXE_PARENT` FOREIGN KEY (`PARENT_ID_`) REFERENCES `ACT_RU_EXECUTION` (`ID_`),
  CONSTRAINT `ACT_FK_EXE_PROCDEF` FOREIGN KEY (`PROC_DEF_ID_`) REFERENCES `ACT_RE_PROCDEF` (`ID_`),
  CONSTRAINT `ACT_FK_EXE_PROCINST` FOREIGN KEY (`PROC_INST_ID_`) REFERENCES `ACT_RU_EXECUTION` (`ID_`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ACT_FK_EXE_SUPER` FOREIGN KEY (`SUPER_EXEC_`) REFERENCES `ACT_RU_EXECUTION` (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_RU_EXECUTION
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_RU_IDENTITYLINK
-- ----------------------------
DROP TABLE IF EXISTS `ACT_RU_IDENTITYLINK`;
CREATE TABLE `ACT_RU_IDENTITYLINK` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `GROUP_ID_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TYPE_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `USER_ID_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TASK_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROC_DEF_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID_`),
  KEY `ACT_IDX_IDENT_LNK_USER` (`USER_ID_`),
  KEY `ACT_IDX_IDENT_LNK_GROUP` (`GROUP_ID_`),
  KEY `ACT_IDX_ATHRZ_PROCEDEF` (`PROC_DEF_ID_`),
  KEY `ACT_FK_TSKASS_TASK` (`TASK_ID_`),
  KEY `ACT_FK_IDL_PROCINST` (`PROC_INST_ID_`),
  CONSTRAINT `ACT_FK_ATHRZ_PROCEDEF` FOREIGN KEY (`PROC_DEF_ID_`) REFERENCES `ACT_RE_PROCDEF` (`ID_`),
  CONSTRAINT `ACT_FK_IDL_PROCINST` FOREIGN KEY (`PROC_INST_ID_`) REFERENCES `ACT_RU_EXECUTION` (`ID_`),
  CONSTRAINT `ACT_FK_TSKASS_TASK` FOREIGN KEY (`TASK_ID_`) REFERENCES `ACT_RU_TASK` (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_RU_IDENTITYLINK
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_RU_JOB
-- ----------------------------
DROP TABLE IF EXISTS `ACT_RU_JOB`;
CREATE TABLE `ACT_RU_JOB` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `TYPE_` varchar(255) COLLATE utf8_bin NOT NULL,
  `LOCK_EXP_TIME_` timestamp(3) NULL DEFAULT NULL,
  `LOCK_OWNER_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `EXCLUSIVE_` tinyint(1) DEFAULT NULL,
  `EXECUTION_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROCESS_INSTANCE_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROC_DEF_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `RETRIES_` int DEFAULT NULL,
  `EXCEPTION_STACK_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `EXCEPTION_MSG_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `DUEDATE_` timestamp(3) NULL DEFAULT NULL,
  `REPEAT_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `HANDLER_TYPE_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `HANDLER_CFG_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `TENANT_ID_` varchar(255) COLLATE utf8_bin DEFAULT '',
  PRIMARY KEY (`ID_`),
  KEY `ACT_FK_JOB_EXCEPTION` (`EXCEPTION_STACK_ID_`),
  CONSTRAINT `ACT_FK_JOB_EXCEPTION` FOREIGN KEY (`EXCEPTION_STACK_ID_`) REFERENCES `ACT_GE_BYTEARRAY` (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_RU_JOB
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_RU_TASK
-- ----------------------------
DROP TABLE IF EXISTS `ACT_RU_TASK`;
CREATE TABLE `ACT_RU_TASK` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `EXECUTION_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROC_DEF_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `PARENT_TASK_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `DESCRIPTION_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `TASK_DEF_KEY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `OWNER_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `ASSIGNEE_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `DELEGATION_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PRIORITY_` int DEFAULT NULL,
  `CREATE_TIME_` timestamp(3) NULL DEFAULT NULL,
  `DUE_DATE_` datetime(3) DEFAULT NULL,
  `CATEGORY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `SUSPENSION_STATE_` int DEFAULT NULL,
  `TENANT_ID_` varchar(255) COLLATE utf8_bin DEFAULT '',
  `FORM_KEY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID_`),
  KEY `ACT_IDX_TASK_CREATE` (`CREATE_TIME_`),
  KEY `ACT_FK_TASK_EXE` (`EXECUTION_ID_`),
  KEY `ACT_FK_TASK_PROCINST` (`PROC_INST_ID_`),
  KEY `ACT_FK_TASK_PROCDEF` (`PROC_DEF_ID_`),
  CONSTRAINT `ACT_FK_TASK_EXE` FOREIGN KEY (`EXECUTION_ID_`) REFERENCES `ACT_RU_EXECUTION` (`ID_`),
  CONSTRAINT `ACT_FK_TASK_PROCDEF` FOREIGN KEY (`PROC_DEF_ID_`) REFERENCES `ACT_RE_PROCDEF` (`ID_`),
  CONSTRAINT `ACT_FK_TASK_PROCINST` FOREIGN KEY (`PROC_INST_ID_`) REFERENCES `ACT_RU_EXECUTION` (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_RU_TASK
-- ----------------------------

-- ----------------------------
-- Table structure for ACT_RU_VARIABLE
-- ----------------------------
DROP TABLE IF EXISTS `ACT_RU_VARIABLE`;
CREATE TABLE `ACT_RU_VARIABLE` (
  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,
  `REV_` int DEFAULT NULL,
  `TYPE_` varchar(255) COLLATE utf8_bin NOT NULL,
  `NAME_` varchar(255) COLLATE utf8_bin NOT NULL,
  `EXECUTION_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PROC_INST_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `TASK_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `BYTEARRAY_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `DOUBLE_` double DEFAULT NULL,
  `LONG_` bigint DEFAULT NULL,
  `TEXT_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `TEXT2_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID_`),
  KEY `ACT_IDX_VARIABLE_TASK_ID` (`TASK_ID_`),
  KEY `ACT_FK_VAR_EXE` (`EXECUTION_ID_`),
  KEY `ACT_FK_VAR_PROCINST` (`PROC_INST_ID_`),
  KEY `ACT_FK_VAR_BYTEARRAY` (`BYTEARRAY_ID_`),
  CONSTRAINT `ACT_FK_VAR_BYTEARRAY` FOREIGN KEY (`BYTEARRAY_ID_`) REFERENCES `ACT_GE_BYTEARRAY` (`ID_`),
  CONSTRAINT `ACT_FK_VAR_EXE` FOREIGN KEY (`EXECUTION_ID_`) REFERENCES `ACT_RU_EXECUTION` (`ID_`),
  CONSTRAINT `ACT_FK_VAR_PROCINST` FOREIGN KEY (`PROC_INST_ID_`) REFERENCES `ACT_RU_EXECUTION` (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ACT_RU_VARIABLE
-- ----------------------------

-- ----------------------------
-- Table structure for ck_inbound
-- ----------------------------
DROP TABLE IF EXISTS `ck_inbound`;
CREATE TABLE `ck_inbound` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '序号',
  `ib_id` varchar(15) DEFAULT NULL COMMENT '入库单号',
  `ib_reason` varchar(30) DEFAULT NULL COMMENT '入库理由',
  `ib_count_should` int DEFAULT NULL COMMENT '应入库数量',
  `ib_count_actual` int DEFAULT NULL COMMENT '实入库数量',
  `ib_count_money` int DEFAULT NULL COMMENT '总金额',
  `ib_register_id` int DEFAULT NULL COMMENT '登记人',
  `ib_register_date` date DEFAULT NULL COMMENT '登记日期',
  `ib_examine_id` int DEFAULT NULL COMMENT '审核人id',
  `ib_examine_date` date DEFAULT NULL COMMENT '审核时间',
  `ib_examine_state` int DEFAULT NULL COMMENT '0代表待审核，1代表通过审核，2代表未通过审核',
  PRIMARY KEY (`id`),
  UNIQUE KEY `ib_id` (`ib_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ck_inbound
-- ----------------------------

-- ----------------------------
-- Table structure for ck_inbound_info
-- ----------------------------
DROP TABLE IF EXISTS `ck_inbound_info`;
CREATE TABLE `ck_inbound_info` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '序号',
  `parent_id` int DEFAULT NULL COMMENT '父级序号',
  `product_id` varchar(20) DEFAULT NULL COMMENT '产品id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `parent_id` (`parent_id`),
  UNIQUE KEY `product_id` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ck_inbound_info
-- ----------------------------

-- ----------------------------
-- Table structure for ck_outbound
-- ----------------------------
DROP TABLE IF EXISTS `ck_outbound`;
CREATE TABLE `ck_outbound` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '序号',
  `ob_id` varchar(15) DEFAULT NULL COMMENT '出库单号',
  `ob_reason` varchar(30) DEFAULT NULL COMMENT '出库理由',
  `ib_count_should` int DEFAULT NULL COMMENT '应出库数量',
  `ib_count_actual` int DEFAULT NULL COMMENT '实出库数量',
  `ob_count_money` int DEFAULT NULL COMMENT '总金额',
  `ob_register_id` int DEFAULT NULL COMMENT '登记人id',
  `ob_register_date` date DEFAULT NULL COMMENT '登记日期',
  `ob_examine_id` int DEFAULT NULL COMMENT '审核人id',
  `ob_examine_date` date DEFAULT NULL COMMENT '审核时间',
  `ob_examine_state` int DEFAULT NULL COMMENT '审核状态',
  PRIMARY KEY (`id`),
  UNIQUE KEY `ob_id` (`ob_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ck_outbound
-- ----------------------------

-- ----------------------------
-- Table structure for ck_outbound_info
-- ----------------------------
DROP TABLE IF EXISTS `ck_outbound_info`;
CREATE TABLE `ck_outbound_info` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '序号',
  `parent_id` int DEFAULT NULL COMMENT '父级序号',
  `product_id` varchar(20) DEFAULT NULL COMMENT '产品id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `parent_id` (`parent_id`),
  UNIQUE KEY `product_id` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ck_outbound_info
-- ----------------------------

-- ----------------------------
-- Table structure for ck_stock
-- ----------------------------
DROP TABLE IF EXISTS `ck_stock`;
CREATE TABLE `ck_stock` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '序号',
  `sk_id` varchar(20) DEFAULT NULL COMMENT '库存id',
  `product_id` varchar(20) DEFAULT NULL COMMENT '产品id',
  `product_name` varchar(30) DEFAULT NULL COMMENT '产品名称',
  `sk_alarm_upper` int DEFAULT NULL COMMENT '库存报警上限数',
  `sk_alarm_lower` int DEFAULT NULL COMMENT '库存报警下限数',
  `sk_storage_max` int DEFAULT NULL COMMENT '最大存储量',
  `sk_storage_current` int DEFAULT NULL COMMENT '当前存储量',
  `u_id` int DEFAULT NULL COMMENT '登记人id(user_id)',
  `sk_register_date` date DEFAULT NULL COMMENT '登记日期',
  `sk_company` varchar(5) DEFAULT NULL COMMENT '单位',
  `sk_price` double DEFAULT NULL COMMENT '单价',
  `sk_date` date DEFAULT NULL COMMENT '生产日期',
  `sk_effective_date` date DEFAULT NULL COMMENT '有效期',
  `sk_model` varchar(10) DEFAULT NULL COMMENT '产品型号',
  `sk_count` int DEFAULT NULL COMMENT '库存量',
  `sk_state` int DEFAULT NULL COMMENT '0表示材料，1表示成品',
  PRIMARY KEY (`id`),
  UNIQUE KEY `sk_id` (`sk_id`),
  UNIQUE KEY `product_id` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ck_stock
-- ----------------------------

-- ----------------------------
-- Table structure for product_design_classify
-- ----------------------------
DROP TABLE IF EXISTS `product_design_classify`;
CREATE TABLE `product_design_classify` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '序号',
  `p_id` int DEFAULT NULL COMMENT '父级序号',
  `kind_id` varchar(20) DEFAULT NULL COMMENT '分类编号',
  `kind_name` varchar(50) DEFAULT NULL COMMENT '分类名称',
  `kind_level` int DEFAULT NULL COMMENT '级别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of product_design_classify
-- ----------------------------
INSERT INTO `product_design_classify` VALUES ('1', null, '1', '电子', '1');
INSERT INTO `product_design_classify` VALUES ('2', '1', '2', '手机', '2');

-- ----------------------------
-- Table structure for product_design_material
-- ----------------------------
DROP TABLE IF EXISTS `product_design_material`;
CREATE TABLE `product_design_material` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '序号',
  `design_id` varchar(50) DEFAULT NULL COMMENT '设计编号',
  `product_id` varchar(50) DEFAULT NULL COMMENT '产品编号',
  `product_name` varchar(50) DEFAULT NULL COMMENT '产品名称',
  `first_kind_id` varchar(20) DEFAULT NULL COMMENT '产品1级分类编号',
  `first_kind_name` varchar(50) DEFAULT NULL COMMENT '产品1级分类名称',
  `second_kind_id` varchar(20) DEFAULT NULL COMMENT '产品2级分类编号',
  `second_kind_name` varchar(50) DEFAULT NULL COMMENT '产品2级分类名称',
  `designer` varchar(50) DEFAULT NULL COMMENT '设计人',
  `module_describe` varchar(400) DEFAULT NULL COMMENT '设计要求',
  `cost_price_sum` int DEFAULT NULL COMMENT '物料总成本',
  `register` varchar(50) DEFAULT NULL COMMENT '登记人',
  `register_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '登记时间',
  `checker` varchar(50) DEFAULT NULL COMMENT '复核人',
  `check_time` date DEFAULT NULL COMMENT '复核时间',
  `changer` varchar(50) DEFAULT NULL COMMENT '变更人',
  `change_time` date DEFAULT NULL COMMENT '变更时间',
  `check_tag` varchar(20) DEFAULT NULL COMMENT '审核标志(等待审核/审核通过/审核不通过)',
  `change_tag` varchar(20) DEFAULT NULL COMMENT '变更标志(未变更/已变更)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of product_design_material
-- ----------------------------
INSERT INTO `product_design_material` VALUES ('1', '1', '1', '小米10', '1', '电子', '2', '手机', 'joker_dj', '质量达标', '3599', 'joker_dj', '2020-04-17 00:00:00', '', null, null, null, '等待审核', '未变更');

-- ----------------------------
-- Table structure for product_design_material_detail
-- ----------------------------
DROP TABLE IF EXISTS `product_design_material_detail`;
CREATE TABLE `product_design_material_detail` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '序号',
  `parent_id` int DEFAULT NULL COMMENT '父级序号',
  `details_number` int DEFAULT NULL COMMENT '物料序号',
  `product_id` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `product_name` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `type` varchar(20) DEFAULT NULL COMMENT '用途类型',
  `product_describe` varchar(100) DEFAULT NULL COMMENT '描述',
  `amount_unit` varchar(20) DEFAULT NULL COMMENT '单位',
  `amount` int DEFAULT NULL COMMENT '数量',
  `residual_amount` int DEFAULT NULL COMMENT '可用数量',
  `cost_price` int DEFAULT NULL COMMENT '单价',
  `subtotal` int DEFAULT NULL COMMENT '小计',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of product_design_material_detail
-- ----------------------------
INSERT INTO `product_design_material_detail` VALUES ('1', null, '1', '1', '屏幕', '商品', '屏幕', '个', '1', '100', '200', null);

-- ----------------------------
-- Table structure for product_design_record
-- ----------------------------
DROP TABLE IF EXISTS `product_design_record`;
CREATE TABLE `product_design_record` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '序号',
  `product_id` varchar(50) NOT NULL COMMENT '产品编号',
  `product_name` varchar(50) DEFAULT NULL COMMENT '产品名称',
  `factory_name` varchar(50) DEFAULT NULL COMMENT '制造商',
  `first_kind_id` varchar(20) DEFAULT NULL COMMENT '产品1级分类编号',
  `first_kind_name` varchar(50) DEFAULT NULL COMMENT '产品1级分类名称',
  `second_kind_id` varchar(20) DEFAULT NULL COMMENT '产品2级分类编号',
  `second_kind_name` varchar(50) DEFAULT NULL COMMENT '产品2级分类名称',
  `product_nick` varchar(50) DEFAULT NULL COMMENT '产品简称',
  `type` varchar(20) DEFAULT NULL COMMENT '用途类型(商品/物料)',
  `product_class` varchar(20) DEFAULT NULL COMMENT '档次级别(高档/中档/低档)',
  `personal_unit` varchar(20) DEFAULT NULL COMMENT '计量单位',
  `personal_value` varchar(20) DEFAULT NULL COMMENT '计量值',
  `provider_group` varchar(400) DEFAULT NULL COMMENT '供应商集合',
  `warranty` varchar(20) DEFAULT NULL COMMENT '保修期',
  `list_price` int DEFAULT NULL COMMENT '市场单价',
  `cost_price` int DEFAULT NULL COMMENT '计划成本单价',
  `real_cost_price` int DEFAULT NULL COMMENT '成本单价',
  `amount_unit` varchar(20) DEFAULT NULL COMMENT '单位',
  `product_describe` varchar(40) DEFAULT NULL COMMENT '产品描述',
  `responsible_person` varchar(50) DEFAULT NULL COMMENT '产品经理',
  `register` varchar(50) DEFAULT NULL COMMENT '登记人',
  `register_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '建档时间',
  `checker` varchar(50) DEFAULT NULL COMMENT '复核人',
  `check_time` date DEFAULT NULL COMMENT '复核时间',
  `check_tag` varchar(20) DEFAULT NULL COMMENT '审核标志(等待审核/审核通过/审核不通过)',
  `changer` varchar(50) DEFAULT NULL COMMENT '变更人',
  `change_time` date DEFAULT NULL COMMENT '变更时间',
  `change_tag` varchar(20) DEFAULT NULL COMMENT '档案变更标志(未变更/已变更)',
  `price_change_tag` varchar(20) DEFAULT NULL COMMENT '价格变更标志(未变更/已变更)',
  `file_change_amount` int DEFAULT NULL COMMENT '档案变更累计',
  `delete_tag` varchar(20) DEFAULT NULL COMMENT '产品删除标志(未删除/已删除)',
  `material_list` varchar(255) DEFAULT NULL COMMENT '物料总计',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of product_design_record
-- ----------------------------
INSERT INTO `product_design_record` VALUES ('1', '1', '小米10', '小米', '1', '电子', '2', '手机', '小米10', '商品', '高档', '个', '1', '[{\'小米\'}]', '3', '3699', '3599', '3699', '个', '小米发烧友', '雷军', 'joker_dj', '2020-04-17 00:00:00', 'joker_dj', '2020-04-17', '等待审核', null, null, '未变更', '未变更', '0', '未删除', '[{\'屏幕\'\'}]');
INSERT INTO `product_design_record` VALUES ('2', '2', '小米9Plus', '小米', '1', '电子', '2', '手机', '小米9', '商品', '高档', '个', '1', '[{\'小米\'}]', '3', '3299', '2999', '3299', '个', '皇家手机', 'string', 'joker_dj', '2020-04-17 00:00:00', '', null, '等待审核', '', '2020-04-17', '未变更', '未变更', '0', '未删除', '[{\'屏幕\'}]');

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `pid` int DEFAULT NULL COMMENT '父级部门ID',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '部门名称',
  `spread` int DEFAULT '0' COMMENT '是否展开0不展开1展开',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '地址',
  `available` int DEFAULT NULL COMMENT '状态【0不可用1可用】',
  `ordernum` int DEFAULT NULL COMMENT '排序码【为了调事显示顺序】',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_dept
-- ----------------------------
INSERT INTO `sys_dept` VALUES ('1', '0', '总经办', '1', '大BOSS', '深圳1', '1', '1', '2019-04-10 14:06:32');
INSERT INTO `sys_dept` VALUES ('2', '1', '销售部', '1', '程序员屌丝', '武汉', '1', '2', '2019-04-10 14:06:32');
INSERT INTO `sys_dept` VALUES ('3', '1', '运营部', '0', '无', '武汉', '1', '3', '2019-04-10 14:06:32');
INSERT INTO `sys_dept` VALUES ('4', '1', '生产部', '0', '无', '武汉', '1', '4', '2019-04-10 14:06:32');
INSERT INTO `sys_dept` VALUES ('5', '2', '销售一部', '0', '销售一部', '武汉', '1', '5', '2019-04-10 14:06:32');
INSERT INTO `sys_dept` VALUES ('6', '2', '销售二部', '0', '销售二部', '武汉', '1', '6', '2019-04-10 14:06:32');
INSERT INTO `sys_dept` VALUES ('7', '3', '运营一部', '0', '运营一部', '武汉', '1', '7', '2019-04-10 14:06:32');
INSERT INTO `sys_dept` VALUES ('8', '2', '销售三部', '0', '销售三部', '11', '1', '8', '2019-04-10 14:06:32');
INSERT INTO `sys_dept` VALUES ('9', '2', '销售四部', '0', '销售四部', '222', '1', '9', '2019-04-10 14:06:32');
INSERT INTO `sys_dept` VALUES ('10', '2', '销售五部', '0', '销售五部', '33', '1', '10', '2019-04-10 14:06:32');
INSERT INTO `sys_dept` VALUES ('35', '4', '生产一部', '0', '生产一部', '武汉', '1', '12', '2019-11-11 11:36:44');
INSERT INTO `sys_dept` VALUES ('39', '4', '生产二部', '0', '生产二部', '湖南', '1', '13', '2020-04-16 00:00:00');
INSERT INTO `sys_dept` VALUES ('47', '1', '仓管部', '0', '仓管部', '湖南', '1', '14', '2020-04-16 00:00:00');
INSERT INTO `sys_dept` VALUES ('48', '47', '仓管一部', '0', '仓管一部', '湖南', '1', '15', '2020-04-16 00:00:00');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `pid` int DEFAULT NULL COMMENT '父级菜单ID',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '类型[topmenu/leftmenu/permission]',
  `typecode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'topmenu:system/business\r\npermission:menu:addMenu\r\n',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '名称',
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '图标',
  `href` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '连接地址',
  `target` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '_self',
  `spread` int DEFAULT NULL COMMENT '是否展开',
  `ordernum` int DEFAULT NULL COMMENT '排序码',
  `available` int DEFAULT NULL COMMENT '状态【0不可用1可用】',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '0', 'topmenu', 'business', '业务管理', 'fa fa-newspaper-o', '', '_self', '0', '2', '1');
INSERT INTO `sys_menu` VALUES ('2', '0', 'topmenu', 'system', '系统管理', 'fa fa-gear', '', '_self', '0', '1', '1');
INSERT INTO `sys_menu` VALUES ('3', '1', 'leftmenu', 'business', '基础数据管理', 'fa fa-gear', '', '_self', '0', '3', '1');
INSERT INTO `sys_menu` VALUES ('4', '1', 'leftmenu', 'business', '进货管理', 'fa fa-gear', '', '_self', '0', '4', '1');
INSERT INTO `sys_menu` VALUES ('5', '1', 'leftmenu', 'business', '销售管理', 'fa fa-gear', '', '_self', '0', '5', '1');
INSERT INTO `sys_menu` VALUES ('6', '3', 'leftmenu', 'business', '客户管理', 'fa fa-gear', 'resources/page/business/customer/customerManager.html', '_self', '0', '6', '1');
INSERT INTO `sys_menu` VALUES ('7', '3', 'leftmenu', 'business', '供应商管理', 'fa fa-gear', 'resources/page/business/provider/providerManager.html', '_self', '0', '7', '1');
INSERT INTO `sys_menu` VALUES ('8', '3', 'leftmenu', 'business', '商品管理', 'fa fa-gear', 'resources/page/business/goods/goodsManager.html', '_self', '0', '8', '1');
INSERT INTO `sys_menu` VALUES ('9', '4', 'leftmenu', 'business', '商品进货', 'fa fa-gear', 'resources/page/business/inport/inportManager.html', '_self', '0', '9', '1');
INSERT INTO `sys_menu` VALUES ('10', '4', 'leftmenu', 'business', '商品退货查询', 'fa fa-gear', 'resources/page/business/outport/outportManager.html', '_self', '0', '10', '1');
INSERT INTO `sys_menu` VALUES ('11', '5', 'leftmenu', 'business', '商品销售', 'fa fa-gear', 'resources/page/business/sales/salesManager.html', '_self', '0', '11', '1');
INSERT INTO `sys_menu` VALUES ('12', '5', 'leftmenu', 'business', '销售退货查询', 'fa fa-gear', 'resources/page/business/salesback/salesbackManager.html', '_self', '0', '12', '1');
INSERT INTO `sys_menu` VALUES ('13', '2', 'leftmenu', 'system', '系统管理', 'fa fa-gear', '', '_self', '0', '13', '1');
INSERT INTO `sys_menu` VALUES ('14', '2', 'leftmenu', 'system', '其它管理', 'fa fa-gear', '', '_self', '0', '14', '1');
INSERT INTO `sys_menu` VALUES ('15', '13', 'leftmenu', 'system', '部门管理', 'fa fa-gear', 'resources/page/system/dept/deptManager.html', '_self', '0', '15', '1');
INSERT INTO `sys_menu` VALUES ('16', '13', 'leftmenu', 'system', '菜单管理', 'fa fa-gear', 'resources/page/system/menu/menuManager.html', '_self', '0', '16', '1');
INSERT INTO `sys_menu` VALUES ('17', '13', 'leftmenu', 'system', '角色管理', 'fa fa-gear', 'resources/page/system/role/roleManager.html', '_self', '0', '17', '1');
INSERT INTO `sys_menu` VALUES ('18', '13', 'leftmenu', 'system', '用户管理', 'fa fa-gear', 'resources/page/system/user/userManager.html', '_self', '0', '18', '1');
INSERT INTO `sys_menu` VALUES ('19', '14', 'leftmenu', 'system', '登陆日志', 'fa fa-gear', 'resources/page/system/loginfo/loginfoManager.html', '_self', '0', '19', '1');
INSERT INTO `sys_menu` VALUES ('20', '14', 'leftmenu', 'system', '数据源监控', 'fa fa-gear', 'http://127.0.0.1:8001/druid/', '_self', '0', '20', '1');
INSERT INTO `sys_menu` VALUES ('21', '14', 'leftmenu', 'system', '系统公告', 'fa fa-gear', 'resources/page/system/notice/noticeManager.html', '_self', '0', '21', '1');
INSERT INTO `sys_menu` VALUES ('22', '14', 'leftmenu', 'system', '图标管理', 'fa fa-gear', 'resources/page/system/icon/icon.html', '_self', '0', '22', '1');
INSERT INTO `sys_menu` VALUES ('23', '6', 'permission', 'customer:query', '客户查询', null, null, '_self', null, '23', '1');
INSERT INTO `sys_menu` VALUES ('24', '6', 'permission', 'customer:add', '客户添加', null, null, '_self', null, '24', '1');
INSERT INTO `sys_menu` VALUES ('25', '6', 'permission', 'customer:delete', '客户删除', null, null, '_self', null, '25', '1');
INSERT INTO `sys_menu` VALUES ('26', '6', 'permission', 'customer:update', '客户更新', null, null, '_self', null, '26', '1');
INSERT INTO `sys_menu` VALUES ('32', '15', 'permission', 'dept:add', '部门添加', '', '', '_self', '0', '27', '1');
INSERT INTO `sys_menu` VALUES ('33', '15', 'permission', 'dept:update', '部门修改', '', '', '_self', '0', '28', '1');
INSERT INTO `sys_menu` VALUES ('34', '15', 'permission', 'dept:delete', '部门删除', '', '', '_self', '0', '29', '1');
INSERT INTO `sys_menu` VALUES ('35', '1', 'leftmenu', 'business', '生产管理', '', '', '_self', '0', '30', '1');
INSERT INTO `sys_menu` VALUES ('36', '35', 'leftmenu', '', '产品生产工序设计', '', '', '_self', '0', '31', '1');
INSERT INTO `sys_menu` VALUES ('37', '35', 'leftmenu', '', '工序物料设计', '', '', '_self', '0', '32', '1');
INSERT INTO `sys_menu` VALUES ('38', '35', 'leftmenu', '', '生产计划管理', '', '', '_self', '0', '33', '1');
INSERT INTO `sys_menu` VALUES ('39', '35', 'leftmenu', '', '生产调度管理', '', '', '_self', '0', '34', '1');
INSERT INTO `sys_menu` VALUES ('40', '35', 'leftmenu', '', '内部生产管理', '', '', '_self', '0', '35', '1');
INSERT INTO `sys_menu` VALUES ('41', '1', 'leftmenu', '', '库存管理', '', '', '_self', '0', '36', '1');
INSERT INTO `sys_menu` VALUES ('42', '41', 'leftmenu', '', '安全库存配置管理', '', '', '_self', '0', '37', '1');
INSERT INTO `sys_menu` VALUES ('43', '41', 'leftmenu', '', '出库申请管理', '', '', '_self', '0', '38', '1');
INSERT INTO `sys_menu` VALUES ('44', '41', 'leftmenu', '', '入库申请管理', '', '', '_self', '0', '39', '1');
INSERT INTO `sys_menu` VALUES ('45', '41', 'leftmenu', '', '出入库调度管理', '', '', '_self', '0', '40', '1');
INSERT INTO `sys_menu` VALUES ('46', '1', 'leftmenu', '', '产品设计', '', '', '_self', '0', '41', '1');
INSERT INTO `sys_menu` VALUES ('47', '46', 'leftmenu', '', '产品档案管理设置', '', '', '_self', '0', '42', '1');
INSERT INTO `sys_menu` VALUES ('48', '46', 'leftmenu', '', '产品档案管理', '', '', '_self', '0', '43', '1');
INSERT INTO `sys_menu` VALUES ('49', '46', 'leftmenu', '', '产品物料组成设计', '', '', '_self', '0', '44', '1');
INSERT INTO `sys_menu` VALUES ('50', '35', 'leftmenu', '', '制定产品生产工序设计单', '', '', '_self', '0', '45', '1');
INSERT INTO `sys_menu` VALUES ('51', '35', 'leftmenu', '', '产品生产工序设计单审核', '', '', '_self', '0', '46', '1');
INSERT INTO `sys_menu` VALUES ('52', '35', 'leftmenu', '', '产品生产工序设计单查询', '', '', '_self', '0', '47', '1');
INSERT INTO `sys_menu` VALUES ('53', '35', 'leftmenu', '', '产品生产工序设计单变更', '', '', '_self', '0', '48', '1');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `available` int DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '超级管理员', '拥有所有菜单权限', '1', '2019-04-10 14:06:32');
INSERT INTO `sys_role` VALUES ('5', '仓库管理员', '仓库管理员', '1', '2019-04-10 14:06:32');
INSERT INTO `sys_role` VALUES ('6', '销售管理员', '销售管理员', '1', '2019-04-10 14:06:32');
INSERT INTO `sys_role` VALUES ('16', '生产管理员', '生产管理员', '1', '2020-04-16 18:52:51');
INSERT INTO `sys_role` VALUES ('17', '设计管理员', '设计管理员', '1', '2020-04-16 18:57:24');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `rid` int NOT NULL COMMENT '角色外键',
  `mid` int NOT NULL COMMENT '菜单外键',
  PRIMARY KEY (`mid`,`rid`) USING BTREE,
  KEY `FK_tcsr9ucxypb3ce1q5qngsfk33` (`rid`) USING BTREE,
  CONSTRAINT `sys_role_menu_ibfk_1` FOREIGN KEY (`mid`) REFERENCES `sys_menu` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `sys_role_menu_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `sys_role` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('1', '1');
INSERT INTO `sys_role_menu` VALUES ('1', '2');
INSERT INTO `sys_role_menu` VALUES ('1', '3');
INSERT INTO `sys_role_menu` VALUES ('1', '4');
INSERT INTO `sys_role_menu` VALUES ('1', '5');
INSERT INTO `sys_role_menu` VALUES ('1', '6');
INSERT INTO `sys_role_menu` VALUES ('1', '7');
INSERT INTO `sys_role_menu` VALUES ('1', '8');
INSERT INTO `sys_role_menu` VALUES ('1', '9');
INSERT INTO `sys_role_menu` VALUES ('1', '10');
INSERT INTO `sys_role_menu` VALUES ('1', '11');
INSERT INTO `sys_role_menu` VALUES ('1', '12');
INSERT INTO `sys_role_menu` VALUES ('1', '13');
INSERT INTO `sys_role_menu` VALUES ('1', '14');
INSERT INTO `sys_role_menu` VALUES ('1', '15');
INSERT INTO `sys_role_menu` VALUES ('1', '16');
INSERT INTO `sys_role_menu` VALUES ('1', '17');
INSERT INTO `sys_role_menu` VALUES ('1', '18');
INSERT INTO `sys_role_menu` VALUES ('1', '19');
INSERT INTO `sys_role_menu` VALUES ('1', '20');
INSERT INTO `sys_role_menu` VALUES ('1', '21');
INSERT INTO `sys_role_menu` VALUES ('1', '22');
INSERT INTO `sys_role_menu` VALUES ('1', '23');
INSERT INTO `sys_role_menu` VALUES ('1', '24');
INSERT INTO `sys_role_menu` VALUES ('1', '25');
INSERT INTO `sys_role_menu` VALUES ('1', '26');
INSERT INTO `sys_role_menu` VALUES ('1', '33');
INSERT INTO `sys_role_menu` VALUES ('5', '1');
INSERT INTO `sys_role_menu` VALUES ('5', '2');
INSERT INTO `sys_role_menu` VALUES ('5', '13');
INSERT INTO `sys_role_menu` VALUES ('5', '16');
INSERT INTO `sys_role_menu` VALUES ('5', '41');
INSERT INTO `sys_role_menu` VALUES ('5', '42');
INSERT INTO `sys_role_menu` VALUES ('5', '43');
INSERT INTO `sys_role_menu` VALUES ('5', '44');
INSERT INTO `sys_role_menu` VALUES ('5', '45');
INSERT INTO `sys_role_menu` VALUES ('6', '1');
INSERT INTO `sys_role_menu` VALUES ('6', '3');
INSERT INTO `sys_role_menu` VALUES ('6', '5');
INSERT INTO `sys_role_menu` VALUES ('6', '6');
INSERT INTO `sys_role_menu` VALUES ('6', '11');
INSERT INTO `sys_role_menu` VALUES ('6', '12');
INSERT INTO `sys_role_menu` VALUES ('6', '23');
INSERT INTO `sys_role_menu` VALUES ('6', '24');
INSERT INTO `sys_role_menu` VALUES ('6', '25');
INSERT INTO `sys_role_menu` VALUES ('6', '26');
INSERT INTO `sys_role_menu` VALUES ('16', '1');
INSERT INTO `sys_role_menu` VALUES ('16', '2');
INSERT INTO `sys_role_menu` VALUES ('16', '13');
INSERT INTO `sys_role_menu` VALUES ('16', '16');
INSERT INTO `sys_role_menu` VALUES ('16', '35');
INSERT INTO `sys_role_menu` VALUES ('16', '36');
INSERT INTO `sys_role_menu` VALUES ('16', '37');
INSERT INTO `sys_role_menu` VALUES ('16', '38');
INSERT INTO `sys_role_menu` VALUES ('16', '39');
INSERT INTO `sys_role_menu` VALUES ('16', '40');
INSERT INTO `sys_role_menu` VALUES ('16', '50');
INSERT INTO `sys_role_menu` VALUES ('16', '51');
INSERT INTO `sys_role_menu` VALUES ('16', '52');
INSERT INTO `sys_role_menu` VALUES ('16', '53');
INSERT INTO `sys_role_menu` VALUES ('17', '1');
INSERT INTO `sys_role_menu` VALUES ('17', '2');
INSERT INTO `sys_role_menu` VALUES ('17', '13');
INSERT INTO `sys_role_menu` VALUES ('17', '16');
INSERT INTO `sys_role_menu` VALUES ('17', '46');
INSERT INTO `sys_role_menu` VALUES ('17', '47');
INSERT INTO `sys_role_menu` VALUES ('17', '48');
INSERT INTO `sys_role_menu` VALUES ('17', '49');

-- ----------------------------
-- Table structure for sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_user`;
CREATE TABLE `sys_role_user` (
  `rid` int NOT NULL COMMENT '角色外键',
  `uid` int NOT NULL COMMENT '用户外键',
  PRIMARY KEY (`uid`,`rid`) USING BTREE,
  KEY `FK_203gdpkwgtow7nxlo2oap5jru` (`rid`) USING BTREE,
  CONSTRAINT `sys_role_user_ibfk_1` FOREIGN KEY (`rid`) REFERENCES `sys_role` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `sys_role_user_ibfk_2` FOREIGN KEY (`uid`) REFERENCES `sys_user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_role_user
-- ----------------------------
INSERT INTO `sys_role_user` VALUES ('5', '14');
INSERT INTO `sys_role_user` VALUES ('5', '15');
INSERT INTO `sys_role_user` VALUES ('16', '12');
INSERT INTO `sys_role_user` VALUES ('16', '13');
INSERT INTO `sys_role_user` VALUES ('17', '16');
INSERT INTO `sys_role_user` VALUES ('17', '17');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `loginname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录名',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '地址',
  `sex` int DEFAULT NULL COMMENT '性别',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
  `deptid` int DEFAULT NULL COMMENT '部门ID',
  `hiredate` datetime DEFAULT NULL COMMENT '入职时间',
  `ordernum` int DEFAULT NULL COMMENT '排序码',
  `type` int DEFAULT NULL COMMENT '用户类型[0超级管理员1普通用户]',
  `imgpath` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '头像地址',
  `salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '盐',
  `available` int DEFAULT '1' COMMENT ' 是否可用',
  `mgr` int DEFAULT NULL COMMENT '直属领导',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `sys_user_loginname` (`loginname`) USING BTREE,
  KEY `FK_3rrcpvho2w1mx1sfiuuyir1h` (`deptid`) USING BTREE,
  CONSTRAINT `sys_user_ibfk_1` FOREIGN KEY (`deptid`) REFERENCES `sys_dept` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '超级管理员', 'system', '系统深处的男人', '0', '超级管理员', '532ac00e86893901af5f0be6b704dbc7', '1', '2018-06-25 11:06:34', '1', '0', 'group1/M00/00/00/rBGuPl6XAZiATNasAAAnSW-kclA511.jpg', '04A93C74C8294AA09A8B974FD1F4ECBB', '1', null);
INSERT INTO `sys_user` VALUES ('12', '曾东东', 'zengdongdong', '湖南', '1', '生产管理', '4d006b3a62f623f54107f81d9a7d8e6d', '35', '2020-04-16 00:00:00', '2', '1', 'group1/M00/00/00/rBGuPl6XAZiATNasAAAnSW-kclA511.jpg', '92a51f887d3c4fa8996b76b4dba47e6f', '1', null);
INSERT INTO `sys_user` VALUES ('13', '孙志贤', 'sunzhixian', '湖南', '1', '生产管理', 'fa44967a2c6c64a5e2d0141c8c9bafd7', '35', '2020-04-16 00:00:00', '3', '1', 'group1/M00/00/00/rBGuPl6XAZiATNasAAAnSW-kclA511.jpg', '010df77a7ce4473ba86f59e568167dd9', '1', '12');
INSERT INTO `sys_user` VALUES ('14', '谷辉', 'guhui', '湖南', '1', '库存管理', '4a7e4bd5a61692951c8744702d383cd5', '48', '2020-04-16 00:00:00', '4', '1', 'group1/M00/00/00/rBGuPl6XAZiATNasAAAnSW-kclA511.jpg', '1087b1b780ec490fa8c2f665f7d25041', '1', '12');
INSERT INTO `sys_user` VALUES ('15', '杨洪坤', 'yanghongkun', '湖南', '1', '库存管理', '5fef33b665ef50a005eb189cb17b64f4', '48', '2020-04-16 00:00:00', '5', '1', 'group1/M00/00/00/rBGuPl6XAZiATNasAAAnSW-kclA511.jpg', '631b5d7bb9974ffe9361a3ce7c87308a', '1', '14');
INSERT INTO `sys_user` VALUES ('16', '丁健', 'dingjian', '湖南', '1', '产品设计', 'b4948237cca1e3a1c46dd1bec1c350bc', '39', '2020-04-16 00:00:00', '6', '1', 'group1/M00/00/00/rBGuPl6XAZiATNasAAAnSW-kclA511.jpg', '5331cfd06e724d3cb14e14278db8ef25', '1', '15');
INSERT INTO `sys_user` VALUES ('17', '李佳伟', 'lijiawei', '湖南', '1', '产品设计', '9413a445c0388ac4b841c806eeeb467f', '39', '2020-04-16 00:00:00', '7', '1', 'group1/M00/00/00/rBGuPl6XAZiATNasAAAnSW-kclA511.jpg', 'f536ef43361446888785eb40fee640f5', '1', '16');
