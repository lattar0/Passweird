import React from 'react';
import { Text, TouchableOpacity } from 'react-native';
import { MaterialCommunityIcons } from '@expo/vector-icons';
import { styles } from './styles';

export function ButtonFooter({ icon, color, text, ...rest }) {
  return (
    <TouchableOpacity activeOpacity={0.7} style={styles.button} {...rest}>
      <MaterialCommunityIcons color={color} size={22} name={icon} />
      <Text style={styles.text}>{ text }</Text>
    </TouchableOpacity>
  );
}

