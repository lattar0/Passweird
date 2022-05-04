import React from 'react';

import { Text, View } from 'react-native';
import { SearchInput } from '../SearchInput';
import { styles } from './styles';

export function Header() {
  return (
    <View style={styles.header}>
      <Text style={styles.textHeader}>Passweird</Text>
      <SearchInput />
    </View>
  );
}
