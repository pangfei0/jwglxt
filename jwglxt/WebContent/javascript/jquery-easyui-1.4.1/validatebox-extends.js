/**
 * Created by 53801 on 2015/8/17.
 */
$.extend($.fn.validatebox.defaults.rules, {
    idcard: {// ��֤���֤
        validator: function (value) {
            return /^\d{15}(\d{2}[A-Za-z0-9])?$/i.test(value);
        },
        message: '���֤�����ʽ����ȷ'
    },
    minLength: {
        validator: function (value, param) {
            return value.length >= param[0];
        },
        message: '���������٣�2�����ַ�.'
    },
    length: { validator: function (value, param) {
        var len = $.trim(value).length;
        return len >= param[0] && len <= param[1];
    },
        message: "�������ݳ��ȱ������{0}��{1}֮��."
    },
    phone: {// ��֤�绰����
        validator: function (value) {
            return /^((\d2,3)|(\d{3}\-))?(0\d2,3|0\d{2,3}-)?[1-9]\d{6,7}(\-\d{1,4})?$/i.test(value);
        },
        message: '��ʽ����ȷ,��ʹ�������ʽ:020-88888888'
    },
    mobile: {// ��֤�ֻ�����
        validator: function (value) {
            return /^(13|15|18)\d{9}$/i.test(value);
        },
        message: '�ֻ������ʽ����ȷ'
    },
    intOrFloat: {// ��֤������С��
        validator: function (value) {
            return /^\d+(\.\d+)?$/i.test(value);
        },
        message: '���������֣���ȷ����ʽ��ȷ'
    },
    currency: {// ��֤����
        validator: function (value) {
            return /^\d+(\.\d+)?$/i.test(value);
        },
        message: '���Ҹ�ʽ����ȷ'
    },
    qq: {// ��֤QQ,��10000��ʼ
        validator: function (value) {
            return /^[1-9]\d{4,9}$/i.test(value);
        },
        message: 'QQ�����ʽ����ȷ'
    },
    integer: {// ��֤���� ��������
        validator: function (value) {
            //return /^[+]?[1-9]+\d*$/i.test(value);

            return /^([+]?[0-9])|([-]?[0-9])+\d*$/i.test(value);
        },
        message: '����������'
    },
    posinteger: {// ��֤���� ����
        validator: function (value) {
            return /^[+]?[1-9]+\d*$/i.test(value);
        },
        message: '������������'
    },
    age: {// ��֤����
        validator: function (value) {
            return /^(?:[1-9][0-9]?|1[01][0-9]|120)$/i.test(value);
        },
        message: '���������0��120֮�������'
    },

    chinese: {// ��֤����
        validator: function (value) {
            return /^[\��-\��]+$/i.test(value);
        },
        message: '����������'
    },
    english: {// ��֤Ӣ��
        validator: function (value) {
            return /^[A-Za-z]+$/i.test(value);
        },
        message: '������Ӣ��'
    },
    unnormal: {// ��֤�Ƿ�����ո�ͷǷ��ַ�
        validator: function (value) {
            return /.+/i.test(value);
        },
        message: '����ֵ����Ϊ�պͰ��������Ƿ��ַ�'
    },
    username: {// ��֤�û���
        validator: function (value) {
            return /^[a-zA-Z][a-zA-Z0-9_]{5,15}$/i.test(value);
        },
        message: '�û������Ϸ�����ĸ��ͷ������6-16�ֽڣ�������ĸ�����»��ߣ�'
    },
    faxno: {// ��֤����
        validator: function (value) {
            //            return /^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[ ]){1,12})+$/i.test(value);
            return /^((\d2,3)|(\d{3}\-))?(0\d2,3|0\d{2,3}-)?[1-9]\d{6,7}(\-\d{1,4})?$/i.test(value);
        },
        message: '������벻��ȷ'
    },
    zip: {// ��֤��������
        validator: function (value) {
            return /^[1-9]\d{5}$/i.test(value);
        },
        message: '���������ʽ����ȷ'
    },
    ip: {// ��֤IP��ַ
        validator: function (value) {
            return /d+.d+.d+.d+/i.test(value);
        },
        message: 'IP��ַ��ʽ����ȷ'
    },
    name: {// ��֤���������������Ļ�Ӣ��
        validator: function (value) {
            return /^[\��-\��]+$/i.test(value) | /^\w+[\w\s]+\w+$/i.test(value);
        },
        message: '����������'
    },
    date: {// ��֤���������������Ļ�Ӣ��
        validator: function (value) {
            //��ʽyyyy-MM-dd��yyyy-M-d
            return /^(?:(?!0000)[0-9]{4}([-]?)(?:(?:0?[1-9]|1[0-2])\1(?:0?[1-9]|1[0-9]|2[0-8])|(?:0?[13-9]|1[0-2])\1(?:29|30)|(?:0?[13578]|1[02])\1(?:31))|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)([-]?)0?2\2(?:29))$/i.test(value);
        },
        message: '��������ʵ����ڸ�ʽ'
    },
    msn: {
        validator: function (value) {
            return /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(value);
        },
        message: '��������Ч��msn�˺�(����abc@hotnail(msn/live).com)'
    },
    same: {
        validator: function (value, param) {
            if ($("#" + param[0]).val() != "" && value != "") {
                return $("#" + param[0]).val() == value;
            } else {
                return true;
            }
        },
        message: '��������Ĳ�һ�£�'
    },
    equals: {
        validator: function(value,param){
            return value == $(param[0]).val();
        },
        message: '��������Ĳ�һ�£�'
    },
    mobileAndPhone: {
        validator: function (value) {
            return /^((\+?86)|(\(\+86\)))?\d{3,4}-\d{7,8}(-\d{3,4})?$|^((\+?86)|(\(\+86\)))?1\d{10}$/.test(value);
        },
        message: '��ϵ��ʽ�����ϱ�׼��'
    }
});