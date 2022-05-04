import React from 'react';

import { TextInput, TouchableOpacity, View } from 'react-native';
import { FontAwesome5 } from '@expo/vector-icons';
import { styles } from './styles';
import { theme } from '../../styles/themes';

export function SearchInput() {
  return (
    <View style={styles.container}>
      <TextInput
        style={styles.textInput}
        placeholder='Search'
        placeholderTextColor={theme.colors.gray}
      />

      <TouchableOpacity style={styles.icon} activeOpacity={0.70}>
        <FontAwesome5
        name='search'
        size={20}
        color={theme.colors.gray}
      />
      </TouchableOpacity>
    </View>
  )
}
