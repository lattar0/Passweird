import React, { useState } from 'react';
import { Text, TouchableOpacity } from 'react-native';
import { MaterialCommunityIcons } from '@expo/vector-icons';
import { styles } from './styles';
import { theme } from '../../styles/theme';

import { useNavigation } from '@react-navigation/core';

export function ButtonFooter({ icon, text, goTo }) {
  const [isPressed, setIsPressed] = useState(false);

  const navigation = useNavigation();

  function onPress() {

    navigation.navigate(goTo);

    setIsPressed(true);
  }

  return (
    <TouchableOpacity activeOpacity={0.7} style={styles.button} onPress={onPress}>
      <MaterialCommunityIcons color={isPressed ? theme.colors.blue : theme.colors.gray} size={22} name={icon} />
      <Text style={isPressed ? styles.textIsPressed : styles.textNormal}>{ text }</Text>
    </TouchableOpacity>
  );
}

